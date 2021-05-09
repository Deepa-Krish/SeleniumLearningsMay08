package sample.test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S3_3EditOpportunity {
        public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// to disable the Browser specification(pop-over)
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
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
		driver.findElementByXPath("//p[text()='Sales']").click();
		//.click() used in .executeScript
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Opportunities']"));
		driver.findElementByXPath("(//input[@type= 'search'])[2]").sendKeys("Sales Force Automation By Deepa", Keys.ENTER);
		Thread.sleep(5000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//div[@data-aura-class = 'forceVirtualAction']/a"));
		//Failing ????? - org.openqa.selenium.JavascriptException: javascript error: Cannot read property 'click' of undefined
		
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//a[@title= 'Edit']"));
		Thread.sleep(2000);
		WebElement input1 = driver.findElementByXPath("//input[@name= 'CloseDate']");
		     input1.clear();
		     input1.sendKeys("5/9/2021");
		driver.findElementByXPath("(//input[contains(@class,'slds-input slds-combobox__input')])[4]").click();
		driver.findElementByXPath(" //span[text()='Perception Analysis']").click();
		Thread.sleep(3000);
		driver.executeScript("arguments[0].click();",driver.findElementByXPath("//label[text()='Delivery/Installation Status']/following::input"));
		driver.findElementByXPath("//span[@title ='In progress']").click();
		driver.findElementByXPath("//textarea[@class ='slds-textarea']").sendKeys("Adding Description");
		driver.findElementByXPath("//button[@name ='SaveEdit']").click();
		Thread.sleep(2000);
		String text = driver.findElementByXPath("//span[text()='Perception Analysis']").getText();
		if (text.equals("Perception Analysis") ) {
			System.out.println("The Opportunity is Edited Successfully");}
		else {
			System.out.println("The Opportunity NOT Edited Successfully");
		}
		Thread.sleep(5000);
		driver.close();

		}	
        
	}


