package parameters.prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestS3_13VerifySorting extends TestngBaseClass {
	        @Test 
	        //(priority = 1, invocationCount = 2)
	        public void runTestS3_13VerifySorting() throws InterruptedException {
			
			driver.findElementByXPath("//button[text()='View All']").click();
			driver.findElementByXPath("//p[text()='Sales']").click();
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Accounts']"));
			Thread.sleep(3000);
			List<WebElement>rows = driver.findElementsByXPath("//tbody/tr/th//a");
			Thread.sleep(2000);
			System.out.println(rows.size());
			List<String> listAccountName = new ArrayList<String>();
				for (int i = 1; i <= rows.size(); i++) {
					String accountName = driver.findElementByXPath("//tbody/tr["+i+"]/th//a").getText();
					System.out.println(accountName);
					listAccountName.add(accountName);
				}
				Thread.sleep(2000);
				Collections.sort(listAccountName);
				System.out.println("After Collections.sort of before sorting data " + listAccountName);
				
				driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Account Name']"));
				Thread.sleep(2000);
				
				List<WebElement>rows2 = driver.findElementsByXPath("//tbody/tr/th//a");
				System.out.println(rows2.size());
				System.out.println("After clicking sort arrow in the Account Name");
				List<String> listAccountNameAfterSorted = new ArrayList<String>();
					for (int i = 1; i <= rows2.size(); i++) {
						String accountName2 = driver.findElementByXPath("//tbody/tr["+i+"]/th//a").getText();
						System.out.println(accountName2);
						listAccountNameAfterSorted.add(accountName2);
					}
					//________________ use Assert instead of if condition _________________________
					
					//Assert.assertEquals(listAccountName.equals(listAccountNameAfterSorted), true);
					//java.lang.AssertionError: expected [true] but found [false]
				
					Assert.assertEquals(listAccountName, listAccountNameAfterSorted);
					//java.lang.AssertionError: Lists differ at element [1]: Boot Camp Puppeteer Shobana != Dinesh expected [Boot Camp Puppeteer Shobana] but found [Dinesh]
					
//					if(listAccountName.equals(listAccountNameAfterSorted))
//					{   
//						System.out.println(listAccountName.equals(listAccountNameAfterSorted));
//						System.out.println("Acount Name are displayed in the Ascending order");
//					}
//					else
//					{    System.out.println(listAccountName.equals(listAccountNameAfterSorted));
//						System.out.println("Acount Name are NOT displayed in the Ascending order");
//					
//					}				
	}

}
