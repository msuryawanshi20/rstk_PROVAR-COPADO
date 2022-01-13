package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Rtmach"                                
               , summary=""
               , page="Rtmach"
               , namespacePrefix="rstk"
               , object="rstk__rtmach__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Rtmach {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Machine Number']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement machineNumber;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement description;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Work Center']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement workCenter;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Responsible Planner']/parent::span/parent::th/following-sibling::td[1]//select")
	public WebElement responsiblePlanner;

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Hourly Rate Option']/parent::span/parent::th/following-sibling::td//select")
	public WebElement hourlyRateOption;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Hourly Rate, Sim']/parent::span/parent::th/following-sibling::td//input")
	public WebElement hourlyRateSim;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Hourly Rate, Std']/parent::span/parent::th/following-sibling::td//input")
	public WebElement hourlyRateStd;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Sales Price per Hour']/parent::th/following-sibling::td//input")
	public WebElement salesPricePerHour;

	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Name']/parent::th/following-sibling::td[1]//span")
	public WebElement name;

	@ButtonType()
	@FindByLabel(label = "Edit")
	public WebElement edit;

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;

}
