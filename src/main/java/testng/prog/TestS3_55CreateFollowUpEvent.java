package testng.prog;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestS3_55CreateFollowUpEvent {

	@Test(groups = {"Smoke"})
	public void runTestS3_55CreateFollowUpEvent() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// to disable the Browser specification(pop-over)
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("matschie@testleaf.com");
		driver.findElementById("password").sendKeys("India@123");
		driver.findElementById("Login").click();
		Thread.sleep(2000);
		List<WebElement> text1 = driver.findElementsByXPath("//a[@class = 'switch-to-lightning']");
		if(text1.size() != 0) {
			driver.findElementByXPath("//a[@class = 'switch-to-lightning']").click();
		}
		driver.findElementByClassName("slds-icon-waffle").click();
		driver.findElementByXPath("//button[text()='View All']").click();
		driver.findElementByXPath("//p[text() = 'Content']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("(//span[text() = 'View All'])[2]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@data-aura-class = 'forceListViewManagerDisplaySwitcher']").click();	
		driver.findElementByXPath("//li[@title = 'Table']").click();	
		driver.findElementByXPath("//span[@class = 'slds-icon_container slds-icon-utility-down']").click();
		Thread.sleep(1000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//ul/li[@class = 'uiMenuItem']//div[@title = 'Create Follow-Up Event']"));
		Thread.sleep(2000);
		driver.findElementByXPath("//span[@class = 'deleteIcon']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@title = 'Derrick Dsouza']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("(//input[@class = 'slds-input slds-combobox__input'])[2]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text() = 'Meeting' and @title = 'Meeting']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//span[@class = 'deleteIcon'])[2]").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//div[@title = 'mtuh']").click();
		driver.findElementByXPath("(//span[@class = 'deleteIcon'])[3]").click();
		driver.findElementByXPath("(//div[@title = 'Prabhu Arunagiri'])[3] ").click();
		Thread.sleep(1000);
		
		WebElement str1 = driver.findElementByXPath("//label[text() = 'Date']/following::input");
		Thread.sleep(1000);
		str1.click();
		str1.clear();
		Thread.sleep(1000);
		str1.sendKeys("Jun 5, 2021");
		Thread.sleep(1000);
		WebElement str2 = driver.findElementByXPath("(//label[text() = 'Date']/following::input)[4]");
		Thread.sleep(1000);
		str2.click();
		str2.clear();
		Thread.sleep(1000);
		str2.sendKeys("Jun 15, 2021");
		Thread.sleep(1000);
		 WebElement test = driver.findElementByXPath("//label[text() = 'Time']/following::input");
				test.click();
				test.clear();
				test.sendKeys("8:00 AM", Keys.TAB);
		Thread.sleep(1000);
		WebElement test2 = driver.findElementByXPath("(//label[text() = 'Time']/following::input)[4]");
		test2.click();
		test2.clear();
		test2.sendKeys("3:00 PM", Keys.TAB);
		Thread.sleep(1000);
		 driver.findElementByXPath("//button[@title ='Save']").click();	
		 Thread.sleep(1000);
		 driver.findElementByXPath("//span/a[@title = 'Meeting']").click();
		 String s1 = driver.findElementByXPath("(//div[@class = 'ownerName'])[2]//a").getText();
		 System.out.println(s1);
		 String s2 = driver.findElementByXPath("(//span[text() = 'Subject'])[3]/following::span[text() = 'Meeting']").getText();
		 System.out.println(s2);
		 String s3 = driver.findElementByXPath("(//span[text() = 'Name'])[4]/following::a[text() = 'mtuh']").getText();
		 System.out.println(s3);
		 String s4 = driver.findElementByXPath("(//span[text() = 'Name'])[4]/following::a[text() = 'Prabhu Arunagiri']").getText();
		 System.out.println(s4);
		 String s5 = driver.findElementByXPath("(//span[text() = 'Start'])[2]/following::span/span").getText();
		 System.out.println(s5);
		 String s6 = driver.findElementByXPath("(//span[text() = 'End'])[2]/following::span/span").getText();		 
		 System.out.println(s6);
	     String a1,a2,a3,a4,a5,a6;
	     a1 = "Derrick Dsouza"; a2 = "Meeting"; a3 ="mtuh"; a4 = "Prabhu Arunagiri"; a5 = "6/5/2021, 11:00 AM";a6 ="6/15/2021, 10:30 AM";
	     
	     System.out.println(a1.equals(s1));
	     System.out.println(a2.equals(s2));
	     System.out.println(a3.equals(s3));
	     System.out.println(a4.equals(s4));
	     System.out.println(a5.equals(s5));
	     System.out.println(a6.equals(s6));
	     
	    driver.close();
	}
}

