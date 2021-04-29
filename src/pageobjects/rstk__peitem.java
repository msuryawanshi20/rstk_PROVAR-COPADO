package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__peitem"                                
               , summary=""
               , page="Peitem"
               , namespacePrefix="rstk"
               , object="rstk__peitem__c"
               , connection="QARSFAdmin"
     )             
public class rstk__peitem {

	@TextType()
	@FindBy(id = "pg:fm:pb:tab_Inventory_lbl")
	public WebElement tab_Inventory_lbl;
	@TextType()
	@FindBy(id = "pg:fm:pb:pbs_InvParam:j_id444:j_id446")
	public WebElement quantityOnHand;
	
}
