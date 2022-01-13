package pageobjects;

import org.openqa.selenium.WebElement;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;

@SalesforcePage( title="Rstk__sorma View"                                
               , summary=""
               , page="sormaView"
               , namespacePrefix="rstk"
               , object="rstk__sorma__c"
               , connection="QARSF_Admin"
     )             
public class rstk__sormaView {

	@ButtonType()
	@FindByLabel(label = "Serial Details")
	public WebElement serialDetails;
	@ButtonType()
	@FindByLabel(label = "Process Receipt")
	public WebElement processReceipt;
	
}
