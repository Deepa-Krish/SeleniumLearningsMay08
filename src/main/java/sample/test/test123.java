package sample.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test123 {

		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			JavascriptExecutor js = (JavascriptExecutor) driver;
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
			driver.findElementByXPath("//p[text() ='Service Console']").click();
			driver.findElementByXPath("//button[@title = 'Show Navigation Menu']").click();	
			Thread.sleep(3000);
			driver.findElementByXPath("//span[text() = 'Refunds']").click();
			driver.findElementByXPath("//a[@title = 'Select List View']").click();
			Thread.sleep(2000);
			driver.findElementByXPath("//span[text() = 'All']").click();
			driver.findElementByXPath("//button[@title ='Show charts']").click();
			driver.findElementByXPath("//a[@title = 'Settings']/lightning-icon[@data-aura-class='forceIcon']").click();	
			driver.findElementByXPath("//a[@title = 'New Chart']").click();
			driver.findElementByXPath("//input[@class = 'chartNameInputBox input']").sendKeys("DKchart");
			Thread.sleep(1000);
			driver.findElementByXPath("(//a[text() ='Horizontal Bar Chart'])[2]").click();
			
			driver.findElementByXPath("(//a[@title ='Vertical Bar Chart'])[2]").click();
			String verticalgraph = driver.findElementByXPath("(//a[@title ='Vertical Bar Chart'])[2]").getText();
			Thread.sleep(2000);
			driver.findElementByXPath("//a[text() ='Count']").click();
			driver.findElementByXPath("//a[@title ='Average']").click();
			Thread.sleep(3000);
//			driver.findElementByXPath("(//a[text() ='Account'])[1]").click();
//			driver.findElementByXPath("(//a[@title ='Amount'])[1]").click();
//			Thread.sleep(2000);
			//driver.findElementByXPath("(//a[text() ='Amount'])[2]").click();
			//driver.findElementByXPath("(//a[@title='Account'])[2]").click();
			
			driver.findElementByXPath("(//span[text() = 'Save'])[2]").click();
			Thread.sleep(2000);
			String v1 = driver.findElementByXPath("//div[@class = 'eclairChartWrapper vbar']").getText();
			Thread.sleep(5000);
			driver.findElementByXPath("//a[@title = 'Settings']/lightning-icon[@data-aura-class='forceIcon']").click();
			String donutGraph = driver.findElementByXPath("//a[@title ='Donut Chart']").getText();
			driver.findElementByXPath("//a[@title ='Donut Chart']").click();
//			String p1 = driver.findElementByXPath("//div[@class = 'eclairChartWrapper pie']").getText();
//			System.out.println(v1);
//			System.out.println(p1);
			//Assert.assertNotEquals(v1, p1, "booo");
			

			

		}

	}

