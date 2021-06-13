package parameters.prog;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParaS3_33DeleteLegalEntity extends ParaTestngBaseClass {
	  @Test(dataProvider = "fetchData")
	  //(groups = {"Regression"})
	  //(priority = 2)
	 public void paraTestS3_33DeleteLegalEntity(String legalEntityName, String legalEnitytSearch) throws InterruptedException {
			driver.findElementByXPath("//button[text()='View All']").click();
			driver.findElementByXPath("//span[text() = 'All Apps']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//p[text() = 'Legal Entities']").click();	
			driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[text()= 'Legal Entities']"));	
			Thread.sleep(2000);
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[text() = 'New']"));
			driver.findElementByXPath("//span[text() = 'Name']/ following::input[@type = 'text']").sendKeys(legalEntityName);
			driver.findElementByXPath("//button[@title = 'Save']").click();
			driver.findElementByXPath("//button[@title = 'Close']").click();
			Thread.sleep(3000);
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Legal Entities']"));
			driver.findElementByXPath("//input[@name= 'LegalEntity-search-input']").sendKeys(legalEnitytSearch, Keys.ENTER);	
			Thread.sleep(2000);
			driver.findElementByXPath("//span[@class ='slds-icon_container slds-icon-utility-down']/span").click();
			driver.findElementByXPath("//a[@title= 'Delete']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//span[text()= 'Delete']").click();
			Thread.sleep(3000);
	String actualstr1 = driver.findElementByXPath("//span[@class = 'toastMessage slds-text-heading--small forceActionsText']").getText();
    String expectedstr1 = "Legal Entity \"SalesForce Automation By Deepa\" was deleted. Undo";
    //Escape sequence used
	//Assert.assertEquals(str1, "Legal Entity (.*) was deleted. Undo");   - don't work
	Assert.assertEquals(actualstr1, expectedstr1);	
	}
	  @DataProvider(name = "fetchData")
      public String[][] sendDataToTest() {
      	String [][] data =  new String [2][2];
      	data[0][0] = "SalesForce Automation By Deepa";
      	data[0][1] = "SalesForce Automation By Deepa";
      	data[1][0] = "SalesForce Automation By Krishnan";
      	data[1][1] = "SalesForce Automation By Krishnan";
      	return data;
}
}
