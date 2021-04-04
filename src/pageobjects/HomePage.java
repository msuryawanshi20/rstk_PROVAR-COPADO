package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;

@Page(title = "HomePage", summary = "", relativeUrl = "", connection = "pde5")
public class HomePage {

	public WebDriver driver;

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Rootstock Site Map']")
	public WebElement rootstockSiteMap;

}
