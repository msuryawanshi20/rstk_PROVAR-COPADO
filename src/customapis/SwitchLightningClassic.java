package customapis;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import com.provar.core.model.base.api.ValueScope;
import com.provar.core.testapi.ITestExecutionContext;
import com.provar.core.testapi.annotations.TestApi;
import com.provar.core.testapi.annotations.TestApiExecutor;
import com.provar.core.testapi.annotations.TestApiParameter;
import com.provar.core.testapi.annotations.TestApiParameterGroup;
import com.provar.core.testapi.annotations.TestApiParameterGroups;
import com.provar.core.testapi.annotations.TestExecutionContext;
import com.provar.core.testapi.annotations.TestLogger;

@TestApi( title="Switch to Lightning OR Classic"
		, summary=""
		, remarks=""
		, iconBase=""
		, defaultApiGroups={"Custom"}
)

@TestApiParameterGroups(parameterGroups={
		@TestApiParameterGroup(groupName="inputs", title="Inputs"),
		@TestApiParameterGroup(groupName="result", title="Result"),
		}
)
	
public class SwitchLightningClassic {
	
    @TestApiParameter(seq=1, 
            summary="connection name",
            remarks = "Provide Connection name.eg. SFConnection.Note: You can find this name under Connections tab",
            mandatory=false,
            parameterGroup="inputs")
    public String connectionName;
    
    @TestApiParameter(seq=2, 
            summary="connection env if env overrides are added",
            remarks = "Provide Env name for which you want enable disable Lightning mode.Eg,AutomationOrg,{GetSelectedEnvironment()}",
            mandatory=true,
            parameterGroup="inputs")
    public String envName;
    
    @TestApiParameter(seq=3, 
            summary="Switch the SF application to classic OR Lightning",
            remarks = "Set TRUE when you want to switch connection to Lightning.",
            mandatory=false,
            parameterGroup="inputs")
    public boolean enableLightningMode;
    
    @TestApiParameter(seq=10, 
            summary="The name that the result will be stored under.",
            remarks="",
            mandatory=false,
            parameterGroup="result")
    public String resultName;

    @TestApiParameter(seq=11, 
            summary="The lifespan of the result.",
            remarks="",
            mandatory=false,
            parameterGroup="result",
            defaultValue="Test")
    public ValueScope resultScope;	
	
	/**
	 * Used to write to the test execution log.
	 */
	@TestLogger
	public Logger testLogger;

	/**
	 * Provides access to facilities, mainly to set and get variable values.
	 */
	@TestExecutionContext
	public ITestExecutionContext testExecutionContext;

	public String updateConnection() {

		String updatedConnectionString = "";
		if (connectionName == null) {
			connectionName = System.getenv("ConnectionName");
			testLogger.info("Connection Name From execution environment : " + connectionName);
		}
		if (envName == "null" || envName == null || envName.isEmpty()) {
			envName = System.getenv("ConnectionEnvironment");
			testLogger.info("Connection ENV From execution environment : " + envName);
		}

		String testProjectFilePath = testExecutionContext.getProjectPath() + "/" + ".testProject";
		File file = new File(testProjectFilePath);
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder b;
		try {
			b = f.newDocumentBuilder();
			Document doc = b.parse(file);
			doc.getDocumentElement().normalize();

			XPath xPath = XPathFactory.newInstance().newXPath();
			Node connectionNode = null;

			if (envName != null) {
				connectionNode = (Node) xPath.compile("/testProject//connection[@name='" + connectionName
						+ "']//connectionUrl[@envName='" + envName + "']").evaluate(doc, XPathConstants.NODE);
				testLogger.info("current connection url value : " + connectionNode.getAttributes().getNamedItem("url"));
			} else {
				connectionNode = (Node) xPath
						.compile("/testProject//connection[@name='" + connectionName + "']//connectionUrl")
						.evaluate(doc, XPathConstants.NODE);
				testLogger
						.info("current connection url string : " + connectionNode.getAttributes().getNamedItem("url"));
			}

			String[] arr = connectionNode.getAttributes().getNamedItem("url").getNodeValue().split(";");
			String connectionURL = "";

			if (enableLightningMode == true) {
				boolean lightningEnabled = false;
				if (connectionNode.getAttributes().getNamedItem("url").getNodeValue().contains("lightningMode=true")) {
					System.err.println("Already in Lightning Mode");
					lightningEnabled = true;
					connectionURL = connectionNode.getAttributes().getNamedItem("url").getNodeValue();

				}
				// Set lightningMode=TREU if lightningMode tag is already present
				else if (connectionNode.getAttributes().getNamedItem("url").getNodeValue()
						.contains("lightningMode=false")) {
					connectionURL = connectionNode.getAttributes().getNamedItem("url").getNodeValue()
							.replace("lightningMode=false", "lightningMode=true");

				} else {
					for (int i = 0; i < arr.length; i++) {
						connectionURL = connectionURL + arr[i];
						if (i < arr.length - 1) {
							connectionURL = connectionURL + ";";
						}
					}
					// append lightningMode=true
					if (lightningEnabled == false && !(connectionURL.contains("lightningMode=false"))) {
						connectionURL = connectionURL + ";lightningMode=true";
					}
				}

			}

			// Disable Lightning mode
			else if (enableLightningMode == false) {
				connectionURL = connectionNode.getAttributes().getNamedItem("url").getNodeValue();

				// check if lightningMode=False OR contains LightningMode Tag
				if (connectionURL.contains("lightningMode=false") || !(connectionURL.contains("lightningMode"))) {//
					System.err.println("Already in Classic Mode");
					connectionURL = connectionNode.getAttributes().getNamedItem("url").getNodeValue();
				}

				// Set lightningMode=False
				else if (connectionURL.contains("lightningMode=true")) {
					connectionURL = connectionURL.replace("lightningMode=true", "lightningMode=false");
				}
			}

			testLogger.info("updated connection url value : " + connectionURL);
			connectionNode.getAttributes().getNamedItem("url").setNodeValue(connectionURL);

			Transformer tf = TransformerFactory.newInstance().newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty(OutputKeys.METHOD, "xml");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "1");

			DOMSource domSource = new DOMSource(doc);
			StreamResult sr = new StreamResult(new File(testProjectFilePath));
			tf.transform(domSource, sr);

			updatedConnectionString = connectionURL;

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return updatedConnectionString;
	}

	@TestApiExecutor
	public void execute() {
		String result = updateConnection();

		testExecutionContext.setValue(resultName, result, resultScope);

	}

}