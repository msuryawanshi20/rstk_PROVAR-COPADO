package pageobjects;

import java.util.List;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage(title = "Rstk__ Stocklocmove", summary = "", page = "Stocklocmove", namespacePrefix = "rstk", object = "rstk__locadd__c", connection = "QARSF_Admin")
public class rstk__Stocklocmove {

	public WebDriver driver;
    public Logger testLogger;

	public rstk__Stocklocmove(WebDriver driver) {
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//input[contains(@id,'locmove_icitem__c_autocomplete')]")
	public WebElement Search_Item;

	@TextType()
	@FindBy(id = "li-0")
	public WebElement Search_Item1;

	public void selectLocationIDfromPicklist(String locationID, String locationNo, String lotNumber, String project)
			throws InterruptedException {

		Thread.sleep(2000);
		if (lotNumber != null) {
			WebElement option = driver
					.findElement(By.xpath("//select[contains(@id,'fromlocation__c')]/option[contains(text(),'"
							+ locationID + " /') and contains(text(),'" + locationNo + "') and contains(text(),'(Lot:"
							+ lotNumber + ")') and contains(text(),'" + project + "')]"));
			System.out.println("Test:" + option);

			option.click();

		} else {
			WebElement option = driver
					.findElement(By.xpath("//select[contains(@id,'fromlocation__c')]/option[contains(text(),'"
							+ locationID + " /') and contains(text(),'" + locationNo + "') and contains(text(),'"
							+ project + "')]"));
			System.out.println("Test:" + option);

			option.click();

		}

	}

	public void selectSerialNumber(String serialNumber) throws InterruptedException {

		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath(
				"//select[contains(@id,'available_serials__c')]/option[contains(text(),'" + serialNumber + "')]"));
		option.click();

	}

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Move Option']/parent::th/following-sibling::td//select")
	public WebElement MoveOption;

	@ButtonType()
	@FindByLabel(label = "Display Loc Move Entries")
	public WebElement displayLocMoveEntries;

	@PageRow()
	public static class InventoryDetailsTable {

		@BooleanType
		@FindBy(xpath = ".//td[1]//input")
		public WebElement selectCheckBox;

		@ChoiceListType()
		@FindBy(xpath = ".//td[2]//select|.//td[2]//span")
		public WebElement toLocID;

		@ChoiceListType()
		@FindBy(xpath = ".//td[3]//span")
		public WebElement toLocNum;

		@TextType
		@FindBy(xpath = ".//td[3]//input")
		public WebElement toLocNumTextBox;

		@TextType
		@FindBy(xpath = ".//td[4]//input|.//td[4]//span")
		public WebElement quantity;

		@TextType
		@FindBy(xpath = ".//td[6]//input")
		public WebElement txnComment;

		@TextType
		@FindBy(xpath = ".//td[7]//input")
		public WebElement toLocComment;

	}

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@FindBy(xpath = "//table[contains(@id,'pbt_locmoveentries')]//tbody//tr")
	@PageTable(firstRowContainsHeaders = false, row = InventoryDetailsTable.class)
	public List<InventoryDetailsTable> inventoryDetailsTable;

	@ButtonType()
	@FindByLabel(label = "Move Selected Items")
	public WebElement moveSelectedItems;

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Move Serial Items']/parent::span/parent::th/following-sibling::td//input")
	public WebElement moveSerialItems;

	@ButtonType()
	@FindByLabel(label = "Select Serials")
	public WebElement selectSerials;

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Serial Count:']/input[2]")
	public WebElement serialCount;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='From Site']/parent::span/parent::th/following-sibling::td//select")
	public WebElement FromSite;

}
