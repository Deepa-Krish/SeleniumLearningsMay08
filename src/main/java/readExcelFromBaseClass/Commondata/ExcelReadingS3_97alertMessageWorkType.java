package readExcelFromBaseClass.Commondata;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class ExcelReadingS3_97alertMessageWorkType extends ExcelReadingTestngBaseClass{
	@BeforeTest
	public void setFileName() {
		excelFileName = "ExcelReadingS3_97alertMessageWorkType";
	}
	
    @Test(dataProvider = "fetchData", retryAnalyzer = LearnIRetryAnalyzer.class)
	public  void excelreadingTestS3_97alertMessageWorkType(String workTypeName) throws InterruptedException {
    	driver.findElementByXPath("//button[text()='View All']").click();
    	driver.findElementByXPath("//span[text() = 'All Apps']").click();
    	
    	WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
    	Actions action = new Actions(driver);
    	action.moveToElement(worktype).click().perform();
         
    	driver.findElementByXPath("//div[text() = 'New']").click();	
    	driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys(workTypeName);	
    	driver.findElementByXPath("//button[@title = 'Save']").click();	
    	String errormessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();		
        String alertmessage = "Complete this field.Apple";
        Assert.assertEquals(errormessage, alertmessage);
        System.out.println(errormessage + "test 1");
	}   

}
