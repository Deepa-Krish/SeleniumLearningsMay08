package parameters.prog;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class ParaS3_1KarthickSampleProg extends ParaTestngBaseClass {
		@Test
		//(priority = 3 , dependsOnMethods = "testng.prog.TestS3_13VerifySorting.runTestS3_13VerifySorting")
		public void paraTestS3_1KarthikSampleProg() throws InterruptedException {	
			driver.findElementByXPath("//button[text()='View All']").click();
			Thread.sleep(3000);
			driver.findElementByXPath("//p[text()='Sales']").click();
			Thread.sleep(3000);
			driver.executeScript("arguments[0].click();", driver.findElementByXPath("//a[@title='Leads']"));	
			Thread.sleep(3000);
			driver.executeScript("arguments[0].click();", driver.findElementByXPath("//a[@title='New']"));
			Thread.sleep(3000);
			driver.executeScript("arguments[0].click();", driver.findElementByXPath("//input[@name='salutation']"));
			driver.executeScript("arguments[0].click();", driver.findElementByXPath("//span[@title='Mr.']"));
			Thread.sleep(5000);
			driver.findElementByXPath("//input[@name='lastName' and @type='text']").sendKeys("LastName123");
			Thread.sleep(5000);
			driver.findElementByXPath("//input[@name='Company']").sendKeys("XYZ");
			Thread.sleep(5000);
			driver.findElementByXPath("//button[@name='SaveEdit']").click();
			Thread.sleep(3000);
			String str = driver.findElementByXPath("//div[contains(@class, 'forceToastMessage') and @data-key='success']//span[contains(@class, 'forceActionsText')]").getText();	
			System.out.println( str);
			Assert.assertEquals(str, "Lead (.*) was created.");
			
//			if(str.matches("Lead (.*) was created.")) {
//				System.out.println("Test case Passed!!!");
//			} else {
//				System.out.println("Test case Failed!!!");
//			}
			
		}

	}


