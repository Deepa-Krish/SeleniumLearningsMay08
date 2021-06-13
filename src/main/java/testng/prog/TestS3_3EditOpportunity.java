package testng.prog;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestS3_3EditOpportunity extends TestngBaseClass{
	    @Test (groups = {"Sanity"})
	    //(invocationCount = 2)
	    //(threadPoolSize = 3, invocationCount = 3)
        public void runTestS3_3EditOpportunity() throws InterruptedException {
		driver.findElementByXPath("//button[text()='View All']").click();
		driver.findElementByXPath("//p[text()='Sales']").click();
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
		driver.findElementByXPath("(//input[@type= 'search'])[2]").sendKeys("Sales Force Automation By Deepa", Keys.ENTER);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[@data-aura-class = 'forceVirtualAction']/a"));
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//a[@title= 'Edit']"));
		Thread.sleep(2000);
		WebElement input1 = driver.findElementByXPath("//input[@name= 'CloseDate']");
		     input1.clear();
		     input1.sendKeys("5/9/2021");
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		driver.findElementByXPath("//span[text() = '--None--']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("(//span[text()='Perception Analysis'])[2]"));
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//label[text()='Delivery/Installation Status']/following::input"));
		driver.findElementByXPath("//span[@title ='In progress']").click();
		driver.findElementByXPath("//textarea[@class ='slds-textarea']").sendKeys("Adding Description");
		driver.findElementByXPath("//button[@name ='SaveEdit']").click();
		Thread.sleep(2000);
		String text = driver.findElementByXPath("//span[text()='Perception Analysis']").getText();
		//Assert.assertEquals(text, "Perception Analysis");
		Assert.assertEquals(text, "Perception Analysis", "testcase not passed");
		
//		if (text.equals("Perception Analysis") ) {
//			System.out.println("The Opportunity is Edited Successfully");}
//		else {
//			System.out.println("The Opportunity NOT Edited Successfully");
//		}

		}	
        
	}


