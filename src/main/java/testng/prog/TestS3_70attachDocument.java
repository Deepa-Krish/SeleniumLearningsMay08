package testng.prog;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestS3_70attachDocument extends TestngBaseClass {
     
	@Test
	public void runTestS3_70attachDocument() throws AWTException {
		driver.findElementByXPath("//button[text()='View All']").click();
    	driver.findElementByXPath("//span[text() = 'All Apps']").click();
		WebElement ele = driver.findElementByXPath("//p[text() = 'Campaigns']");
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		driver.findElementByXPath("//a[text() = 'Bootcamp']").click();
		driver.findElementByXPath("//div[text() = 'Upload Files']").click();
		//for uploading the documents
		Robot robot = new Robot();
		StringSelection stringselection = new StringSelection("C:\\Users\\deepa\\Testcase to upload to salesforce\\SaleforceDoc1.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.setAutoDelay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElementByXPath("//span[text() = 'Done']").click();
		driver.findElementByXPath("//span[@class = 'view-all-label']").click();
		String text = driver.findElementByXPath("(//span[text() = 'SaleforceDoc1'])[3]").getText();
		Assert.assertEquals(text, "SaleforceDoc1");
		System.out.println(text);
		
		
	}
	
}
