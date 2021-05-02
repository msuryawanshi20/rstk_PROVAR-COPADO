package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Woorddmd"                                
               , summary=""
               , page="Woorddmd"
               , namespacePrefix="rstk"
               , object="rstk__woorddmd__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Woorddmd {

	@TextType()
	@FindBy(xpath = "//input[@id='woorddmd_compitem__c_autocomplete']")
	public WebElement Component_Item;
	@TextType()
	@FindBy(id = "li-0")
	public WebElement Component_ItemLookup;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Qty Per']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement qtyPer;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
