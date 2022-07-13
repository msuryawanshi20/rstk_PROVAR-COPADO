package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstkf__arcntl"                                
               , summary=""
               , page="arcntl"
               , namespacePrefix="rstkf"
               , object="rstkf__arcntl__c"
               , connection="QARSF_Admin"
     )             
public class rstkf__arcntl {

	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Multiple Transactions per Session']/parent::span/parent::th/following-sibling::td[1]//input")
	public WebElement multipleTransactionsPerSession;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	
}
