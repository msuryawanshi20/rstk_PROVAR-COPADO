package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.DateType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__dwocst", summary = "", page = "DWocst", namespacePrefix = "rstk", object = "rstk__wocst__c", connection = "QARSF_Admin")
public class rstk__dwocst {

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'wocst_ordno__c')]//input")
	public WebElement orderNumber;

	@TextType()
	@FindBy(xpath = "//input[@id='wocst_item__c_autocomplete']")
	public WebElement DisassemblyItemText;

	@TextType()
	@FindBy(id = "li-0")
	public WebElement DisassemblyItemLookup;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Disassembly Item Quantity']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement disassemblyItemQuantity;

	@DateType
	@FindBy(xpath = "	//input[contains(@id,'wocst_duedte__c')]")
	public WebElement dueDate;
		
	@TextType()
	@FindBy(xpath = "//*[contains(@id,'wocst_proj__c_autocomplete')]")
	public WebElement project;
	
	
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_ConsumableComponents_lbl')]")
	public WebElement tab_ConsumableComponents_lbl;

	@ButtonType()
	@FindBy(xpath = "//input[@value='Add Component']")
	public WebElement addComponent;

	@TextType()
	@FindBy(xpath = "//*[contains(text(),' Status')]//following::td//span[contains(@id,'wocst_ordsts_pl__c')]")
	public WebElement status;
	
	
	@TextType()
	@FindBy(xpath = "//*[contains(@id,'wocst_ordno__c')]//span//span")
	public WebElement opOrderNumber;
	

	@ButtonType()
	@FindByLabel(label = "Issue Disassembly Item")
	public WebElement issueDisassemblyItem;

	@ButtonType()
	@FindBy(xpath = "//*[@value='Generate Picklist']")
	public WebElement generatePicklist;

	@LinkType()
	@FindBy(linkText = "Rootstock Site Map")
	public WebElement rootstockSiteMap;

	@TextType()
	@FindBy(xpath = "//*[contains(@id,'tab_DerivedComponents_lbl')]")
	public WebElement tab_DerivedComponents_lbl;

	@ButtonType()
	@FindByLabel(label = "All")
	public WebElement all;

	@PageTable(row = DerivedComponents.class)
	@FindBy(xpath = "//table[contains(@id,'pbs_DerivedComponents')]//tbody//tr")
	public List<DerivedComponents> derivedComponents;

	@PageRow(byColumn = true)
	public static class DerivedComponents {

		@TextType()
		@FindBy(xpath = ".//td[6]//input")
		public WebElement actualYield;
		
		@ChoiceListType
		@FindBy(xpath = ".//select//option")
		public WebElement locationID;
		
		@BooleanType
		@FindBy(xpath = ".//td//input[@type='checkbox']")
		public WebElement select;
		
		
	}

	@ButtonType()
	@FindBy(xpath = "//input[@value='Accept Updated Values']")
	public WebElement acceptUpdatedValues;

	@ButtonType()
	@FindBy(xpath = "//input[@value='Receive Derived Components']")
	public WebElement receiveDerivedComponents;

	@ButtonType()
	@FindByLabel(label = "Close Work Order")
	public WebElement closeWorkOrder;
	
}
