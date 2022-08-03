package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sales Order Track"                                
               , summary=""
               , page="SalesOrderTrack"
               , namespacePrefix="rstk"
               , object="rstk__sohdr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__SalesOrderTrack {

	@TextType()
	@FindBy(xpath = "//h3[text()='Sales Order Shipping Detail']/following::div//table[1]")
	public WebElement SalesOrderShippingDetail;
	
}
