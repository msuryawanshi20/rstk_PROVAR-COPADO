package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="Rstk__ Woissuer"                                
               , summary=""
               , page="Woissuer"
               , namespacePrefix="rstk"
               , object="rstk__woiss__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Woissuer {

	@TextType()
	@FindBy(xpath = "//input[@id='woiss_hdrordno__c_autocomplete']")
	public WebElement workOrder;

	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement list;

	@TextType()
	@FindBy(xpath = "//*[normalize-space(.)='Transaction Date']//parent::span/parent::th/parent::tr//following-sibling::td//input")
	public WebElement transactionDate;

	@TextType()
	@FindBy(xpath = "//*[normalize-space(.)='Transaction Date']//parent::span/parent::th/parent::tr//following-sibling::td//span")
	public WebElement transactionDateLink;

	@ButtonType()
	@FindByLabel(label = "Display Components")
	public WebElement displayComponents;

	@BooleanType()
	@FindBy(xpath = "//input[contains(@id,'selectAll')]")
	public WebElement selectAll;

	@ButtonType()
	@FindByLabel(label = "Reverse Issue Selected Components")
	public WebElement reverseIssueSelectedComponents;

}
