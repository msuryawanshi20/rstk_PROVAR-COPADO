package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Pebom"                                
               , summary=""
               , page="Pebom"
               , namespacePrefix="rstk"
               , object="rstk__pebom__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Pebom {

	@TextType()
	@FindBy(xpath = "//input[@id='pebom_item__c_autocomplete']")
	public WebElement parentItem;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;
	@TextType()
	@FindBy(xpath = "//input[@id='pebom_compitem__c_autocomplete']")
	public WebElement componentItem;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Quantity Per']/parent::span/parent::th/following-sibling::td//input")
	public WebElement quantityPer;
	@TextType()
	@FindBy(xpath = "//td[contains(@id,'tab_Mrpoverrides_lbl')]")
	public WebElement tab_Mrpoverrides_lbl;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Scrap Factor']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement scrapFactor;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Setup Quantity']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement setupQuantity;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Line Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement lineNumber;
	@BooleanType()
	@FindBy(xpath = "//td//td/span/span/input")
	public WebElement fixedQuantity;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Phantom Override']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Phantom_Override;
	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;
	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;
	
}
