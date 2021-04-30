package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__peitem"                                
               , summary=""
               , page="Peitem"
               , namespacePrefix="rstk"
               , object="rstk__peitem__c"
               , connection="QARSFAdmin"
     )             

public class rstk__peitem {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Quantity On-Hand']/parent::span/parent::th/following-sibling::td[1]//span")
	public WebElement quantityOnHand;
	@TextType()
	@FindBy(id = "pg:fm:pb:tab_Inventory_lbl")
	public WebElement tab_Inventory_lbl;
	
}