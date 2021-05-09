package sample.test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S3_13VerifySorting {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
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
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//span[text() = 'Accounts']"));
			Thread.sleep(3000);
			driver.executeScript("arguments[0].click();",driver.findElementByXPath("//th[@title= 'Account Name']"));
			List<WebElement>rows = driver.findElementsByXPath("//tbody/tr"){
				for (int i = 1; i <= rows.size(); i++) {
					String text = driver.findElementByXPath("//tbody/tr")
					
				}
			}
			
			


	}

}
