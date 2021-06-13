package testng.prog;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestngBaseClass {
	public static ChromeDriver driver;
	
  @BeforeMethod(alwaysRun=true)
  public void preCondition() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
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
		
  }
  
  
//  @Test (groups = "Regression")
//  public void runTestS3_33DeleteLegalEntity() throws InterruptedException {
//		
//}
//
//  
//  @Test (groups = {"Sanity"})
//  public void runTestS3_3EditOpportunity()throws InterruptedException
//  {
//	  System.out.println("runedit");
//  }
//  
//            @AfterMethod(alwaysRun=true)
//             public void postCondition() throws InterruptedException {
//	         Thread.sleep(5000);
//		     driver.close();
//  }

  
  
}
