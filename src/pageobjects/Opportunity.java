package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Opportunity"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSF_Admin"
     )             
public class Opportunity {

	@ButtonType()
	@FindBy(xpath = "//div[1]/table//input[@name='ids']")
	public WebElement SelectRow_chkbox;
	@ButtonType()
	@FindBy(xpath = "//input[@value='Select']")
	public WebElement Select;
	@TextType()
	@FindBy(xpath = "//table[@class='genericTable brandSecondaryBrd multiLineItem']//tr[5]//th")
	public WebElement ProductSelected;
	@TextType()
	@FindBy(xpath = "//td[3]/input")
	public WebElement Quantity;
	@ButtonType()
	@FindBy(xpath = "//tr[1]/td/input[@name='save']")
	public WebElement save;
	@TextType()
	@FindBy(xpath = "//input[@id='search']")
	public WebElement byKeyword;
			
}
