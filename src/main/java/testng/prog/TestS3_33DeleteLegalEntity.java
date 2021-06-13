package testng.prog;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestS3_33DeleteLegalEntity extends TestngBaseClass {
	  @Test (groups = {"Regression"})
	  //(priority = 2)
	 public void runTestS3_33DeleteLegalEntity() throws InterruptedException {
			driver.findElementByXPath("//button[text()='View All']").click();
			driver.findElementByXPath("//span[text() = 'All Apps']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//p[text() = 'Legal Entities']").click();	
			driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[text()= 'Legal Entities']"));	
			Thread.sleep(2000);
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[text() = 'New']"));
			driver.findElementByXPath("//span[text() = 'Name']/ following::input[@type = 'text']").sendKeys("SalesForce Automation By Deepa");
			driver.findElementByXPath("//button[@title = 'Save']").click();
			driver.findElementByXPath("//button[@title = 'Close']").click();
			Thread.sleep(3000);
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Legal Entities']"));
			driver.findElementByXPath("//input[@name= 'LegalEntity-search-input']").sendKeys("SalesForce Automation By Deepa", Keys.ENTER);	
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
	
//	if (str1.matches("Legal Entity (.*) was deleted. Undo")) {
//    	System.out.println("Lecal Entity is Deleted");
//    }else {
//    	System.out.println("Legal Entity is NOT Deleted");
//    }
		
	}

}
