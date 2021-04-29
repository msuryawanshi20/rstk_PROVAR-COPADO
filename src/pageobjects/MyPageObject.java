package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="My Page Object"                                
     , summary=""
     , relativeUrl=""
     , connection="QARSFAdmin"
     )             
public class MyPageObject {

public WebDriver driver;

	public MyPageObject(WebDriver driver) {

		this.driver = driver;
	}

		public void dropdown(String Item) throws InterruptedException {

		Thread.sleep(2000);

		List <WebElement> option = driver.findElements(
				By.xpath("//select/option[contains(text(),'" + Item + "')]"));
 
		for(int i=0;i<option.size();i++)
                {
                    option.get(i).click();
                }

	}
			
}
