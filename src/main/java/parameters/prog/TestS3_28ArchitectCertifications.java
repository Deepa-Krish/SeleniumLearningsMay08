package parameters.prog;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestS3_28ArchitectCertifications {
    @Test (enabled = true)
	public  void runTestS3_28ArchitectCertifications() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup(); //System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe"); - Not needed since given WebDeriverManager
		Map<String, Object> p = new HashMap<String, Object>();
	    p.put("download.default_directory","C:\\SampleWorkspace\\SelMay2021\\CreatedFolder_Screenshots");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("prefs", p);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("matschie@testleaf.com");
		driver.findElementById("password").sendKeys("India@123");
		driver.findElementById("Login").click();
		Thread.sleep(2000);
		String firstWindowHandle = driver.getWindowHandle();
		System.out.println(firstWindowHandle);
		driver.findElementByXPath("//span[text() = 'Learn More']").click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		List<String>listHandles = new ArrayList<String>(allWindowHandles);
		driver.switchTo().window(listHandles.get(1));
		WebElement Resource = driver.findElementByXPath("//span[text() = 'Resources']");
		Actions builder = new Actions(driver);
		builder.moveToElement(Resource).perform();
		driver.findElementByXPath("//a[@href = 'https://trailhead.salesforce.com/credentials/administratoroverview/']").click();
		Set<String> allWindowHandles2 = driver.getWindowHandles();
		List<String>listHandles2 = new ArrayList<String>(allWindowHandles2);
		driver.switchTo().window(listHandles2.get(2));
		Thread.sleep(2000);
		driver.findElementByXPath("//div[text() = 'Salesforce Architect']").click();
		String str = driver.findElementByXPath("//div[contains (text(), 'Salesforce Architects are the most trusted digital')]").getText();
         System.out.println(str);
         
         Actions builder1 = new Actions(driver);
         WebElement imag1 =  driver.findElementByXPath("//img[contains (@alt, 'Salesforce Architect Journey certification path')]");
         builder1.contextClick(imag1).perform();
         Thread.sleep(2000);
         Robot robot = new Robot();
         robot.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(3000);
         WebElement imag2 = driver.findElementByXPath("(//img[contains (@alt, 'Salesforce Architect Journey certification path')])[2]");		
         builder1.contextClick(imag2).perform();
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_DOWN);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
         robot.keyPress(KeyEvent.VK_ENTER);
         Thread.sleep(3000);
         for (int i = 1; i <= 6; i++) {
			String text = driver.findElementByXPath("//div[text() = 'Certification']/following:: a[contains(text(),'Architect')] ["+i+"]").getText();
			System.out.println(text);
			Thread.sleep(2000);
		}
         driver.findElementByXPath("//div[text() = 'Certification']/following:: a[contains(text(),'Architect')]").click();
         Thread.sleep(2000);
         for (int i = 1; i <= 7; i++) {
			String text2 = driver.findElementByXPath("//div[text() = 'Certification']/following:: a ["+i+"]").getText();
			System.out.println(text2);
			i++;
			
		}
         driver.switchTo().window(listHandles2.get(2));
         driver.close();
         Thread.sleep(2000);
         driver.switchTo().window(listHandles.get(1));
         driver.close();
         Thread.sleep(2000);
         driver.switchTo().window(listHandles.get(0));
         driver.close();

	}
}



