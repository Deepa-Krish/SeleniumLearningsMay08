package parameters.prog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class ParaS3_97alertMessageWorkType extends ParaTestngBaseClass{
	
    @Test(dataProvider = "fetchData")
	public  void paraTestS3_97alertMessageWorkType(String workTypeName) throws InterruptedException {
    	driver.findElementByXPath("//button[text()='View All']").click();
    	driver.findElementByXPath("//span[text() = 'All Apps']").click();
    	
    	WebElement worktype = driver.findElementByXPath("//p[text() = 'Work Types']");
    	Actions action = new Actions(driver);
    	action.moveToElement(worktype).click().perform();
  
    	driver.findElementByXPath("//div[text() = 'New']").click();	
    	driver.findElementByXPath("(//input[@type = 'text'])[3]").sendKeys(workTypeName);	
    	driver.findElementByXPath("//button[@title = 'Save']").click();	
    	String errormessage = driver.findElementByXPath("//li[text()='Complete this field.']").getText();		
        String alertmessage = "Complete this field.";
        Assert.assertEquals(errormessage, alertmessage);
	}   
     
        @DataProvider(name = "fetchData")
    public String[][] sendDataToTest() {
    	String [][] data =  new String [3][1];
    	data[0][0] = "Bootcamp";
    	data[1][0] = "TestLeaf";
    	data[2][0] = "ABC123!@#";
    	return data;

	}	

}
