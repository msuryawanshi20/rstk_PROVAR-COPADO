package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="rootstockWOGrid"                                
               , summary=""
               , connection="QARSF_Admin"
               , object=""
     )             
public class rootstockWOGrid {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//input[@id='input-643']")
	public WebElement derivedComponentItem;
	
	@ButtonType()
	@FindBy(xpath = "//header[normalize-space(.)='Derived Components']/parent::div/following-sibling::div/slot//button[normalize-space(.)='Add']")
	public WebElement addDerivedComponent;
}
