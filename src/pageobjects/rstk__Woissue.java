package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;

@SalesforcePage(title = "Rstk__ Woissue", summary = "", page = "Woissue", namespacePrefix = "rstk", object = "rstk__woiss__c", connection = "QARSF_Admin")
public class rstk__Woissue {

	public WebDriver driver;

	public rstk__Woissue(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	@ButtonType()
	@FindBy(xpath = "//*[@value='Issue Selected Components']")
	public WebElement issueSelectedComponents;

	@ChoiceListType()
	@FindBy(name = "pg:fm:pb_search:pbs_search:j_id88:j_id106:j_id107:woiss_hdrordno__c:j_id109:j_id115")
	public WebElement Work_Order;

	public void selectWOrkOrderfromPicklist(String workOrderNumber) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		String elementLocator = "//select[contains(@name,'woiss_hdrordno__c')]//option[contains(text(),'"
				+ workOrderNumber + "')]";

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementLocator)));

		WebElement option = driver.findElement(By.xpath(elementLocator));
		option.click();

	}

	@ButtonType()
	@FindByLabel(label = "Display Components")
	public WebElement displayComponents;

	@LinkType()
	@FindBy(linkText = "Rootstock Site Map")
	public WebElement rootstockSiteMap;

	@BooleanType
	@FindBy(xpath = "//label[normalize-space(.)='Select All']/parent::span/input")
	public WebElement selectAllCheckBox;
}
