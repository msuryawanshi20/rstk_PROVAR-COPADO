package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__sysite"                                
               , summary=""
               , page="Sysite"
               , namespacePrefix="rstk"
               , object="rstk__sysite__c"
               , connection="Devqaff"
     )             
public class rstk__sysite {

	@ButtonType()
	@FindByLabel(label = "Delete")
	public WebElement delete;
	@TextType()
	@FindBy(xpath = "//h4[normalize-space(.)='Errors']")
	public WebElement Error_Message;
	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[1]")
	public WebElement Error_1;
	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[2]")
	public WebElement Error_2;
	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[3]")
	public WebElement Error_3;
	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[4]")
	public WebElement Error_4;
	@TextType()
	@FindBy(xpath = "//h4[text()='Errors']/following::tr[1]/td//span//ul//li[5]")
	public WebElement Error_5;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Site Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement siteNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
