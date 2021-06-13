package parameters.prog;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LearningGroups {
  @Test(groups = {"Sanity"})
  public void runTest1() {
	  System.out.println("runTest1 - Ran");
  }
  @Test(groups = {"Regression"})
  public void runTest2() {
	  System.out.println("runTest2 - Ran");
  }

  @Test(groups = {"Smoke"})
  public void runTest3() {
	  System.out.println("runTest3 - Ran");
  }

  @Test(groups = {"Regression", "Sanity"})
  public void runTest4() {
	  System.out.println("runTest4 - Ran");
  }


}
