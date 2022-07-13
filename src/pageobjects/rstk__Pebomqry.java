package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Pebomqry"                                
               , summary=""
               , page="Pebomqry"
               , namespacePrefix="rstk"
               , object="rstk__pebom__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Pebomqry {

	@TextType()
	@FindBy(xpath = "//input[@id='pebom_item__c_autocomplete']")
	public WebElement Parent_Item;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Parent_Item1;
	@ButtonType()
	@FindBy(xpath = "//label[normalize-space(.)='Division']/parent::span/parent::th/parent::tr/parent::tbody/parent::table/parent::div/parent::div/parent::span/parent::div/following-sibling::div[1]//input")
	public WebElement searchBOMs;
	@TextType()
	@FindBy(xpath = "//input[@id='pebom_compitem__c_autocomplete']")
	public WebElement Component_Item;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Component_Item1;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Status']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement Status;
	@BooleanType()
	@FindBy(xpath = "//div/div/div/div/div/div//td/input")
	public WebElement includeAllRevisionsBelowThisRevision;
	@PageRow()
	public static class Table {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='View']")
		public WebElement View;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Edit']")
		public WebElement edit;
	}
	@FindBy(id = "pg:fm2:j_id213:j_id231:tb")
	@PageTable(firstRowContainsHeaders = false, row = Table.class)
	public List<Table> table;
	
}
