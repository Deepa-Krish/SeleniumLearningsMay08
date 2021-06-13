package parameters.prog;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderS3_3EditOpportunity extends ParaTestngBaseClass {
	    @Test(dataProvider = "fetchData")
	    //(groups = {"Sanity"})
	    //(invocationCount = 2)
	    //(threadPoolSize = 3, invocationCount = 3)
        public void dataTestS3_3EditOpportunity(String opportunityName, String opportunityDate, String oppAddingDescription) throws InterruptedException {
		driver.findElementByXPath("//button[text()='View All']").click();
		driver.findElementByXPath("//p[text()='Sales']").click(); 
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
		driver.findElementByXPath("(//input[@type= 'search'])[2]").sendKeys(opportunityName, Keys.ENTER);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[@data-aura-class = 'forceVirtualAction']/a"));
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//a[@title= 'Edit']"));
		Thread.sleep(2000);
		WebElement input1 = driver.findElementByXPath("//input[@name= 'CloseDate']");
		     input1.clear();
		     input1.sendKeys(opportunityDate);
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		driver.findElementByXPath("//span[text() = '--None--']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("(//span[text()='Perception Analysis'])[2]"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//label[text()='Delivery/Installation Status']/following::input"));
		driver.findElementByXPath("//span[@title ='In progress']").click();
		driver.findElementByXPath("//textarea[@class ='slds-textarea']").sendKeys(oppAddingDescription);
		driver.findElementByXPath("//button[@name ='SaveEdit']").click();
		Thread.sleep(2000);
		String text = driver.findElementByXPath("//span[text()='Perception Analysis']").getText();
//      Assert.assertEquals(text, "Perception Analysis");
		Assert.assertEquals(text, "Perception Analysis", "testcase not passed");
	 }	
        @DataProvider(name = "fetchData")
        public String[][] sendDataToTest() {
        	String [][] data =  new String [2][3];
        	data[0][0] = "Sales Force Automation By Deepa";
        	data[0][1] = "5/9/2021 ";
        	data[0][2] = "Adding Description";
        	data[1][0] = "Sales Force Automation By DKK";
        	data[1][1] = "6/9/2021";
        	data[1][2] = "Adding Description test 2 ";
//        	data[2][0] = "Sales Force Automation By DeepaKrish";
//        	data[2][1] = "6/9/2021";
//        	data[2][2] = "Adding Description test 2 ";
        	return data;

		}	
        
	
}
