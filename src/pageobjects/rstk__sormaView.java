package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

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
