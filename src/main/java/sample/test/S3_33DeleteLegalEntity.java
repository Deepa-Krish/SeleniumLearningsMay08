package sample.test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S3_33DeleteLegalEntity {

	 public static void main(String[] args) throws InterruptedException {
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
			//js.executeScript("window.scrollBy(0,1000)");
			driver.findElementByXPath("//span[text() = 'All Apps']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//p[text() = 'Legal Entities']").click();	
			driver.findElementByXPath("//span[text()= 'Legal Entities']").click();		
			driver.findElementByXPath("//input[@name= 'LegalEntity-search-input']").sendKeys("SalesForce Automation By Deepa", Keys.ENTER);	
			Thread.sleep(2000);
			driver.findElementByXPath("//span[@class ='slds-icon_container slds-icon-utility-down']/span").click();
			driver.findElementByXPath("//a[@title= 'Delete']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//span[text()= 'Delete']").click();
			Thread.sleep(3000);
	String str = driver.findElementByXPath("//span[@class = 'toastMessage slds-text-heading--small forceActionsText']").getText();
    //System.out.println(str);
    if (str.matches("Legal Entity (.*) was deleted. Undo")) {
    	System.out.println("Lecal Entity is Deleted");
    }else {
    	System.out.println("Legal Entity is NOT Deleted");
    }
		
	}

}
