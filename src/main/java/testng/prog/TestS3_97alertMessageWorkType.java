package testng.prog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class TestS3_97alertMessageWorkType extends TestngBaseClass{
	
    @Test
	public void runTestS3_97alertMessageWorkType() throws InterruptedException {
    	driver.findElementByXPath("//button[text()='View All']").click();
    	driver.findElementByXPath("//span[text() = 'All Apps']").click();
    	
    	WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
    	
    	//*************scroll not happening
//    	driver.findElementByXPath("//input[@placeholder = 'Search apps or items...']").sendKeys("Work Types");
//    	Thread.sleep(2000);
//    	driver.executeScript("arguments[0].click();", driver.findElementByXPath("//a[@data-label = 'Work Types']/span"));
    	Actions action = new Actions(driver);
    	action.moveToElement(worktype).click().perform();
    	
    	
    	
    	driver.findElementByXPath("//div[text() = 'New']").click();	
    	driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys("Bootcamp");	
    	driver.findElementByXPath("//button[@title = 'Save']").click();	
    	String errormessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();		
//        String alertmessage = "Complete this field.";
//        Assert.assertEquals(errormessage, alertmessage);
    	Assert.assertEquals(errormessage, "Complete this field.");
	}

}
