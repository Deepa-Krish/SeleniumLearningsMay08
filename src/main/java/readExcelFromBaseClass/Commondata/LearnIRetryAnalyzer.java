package readExcelFromBaseClass.Commondata;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnIRetryAnalyzer implements IRetryAnalyzer{
     int maxRetry = 2;
     int retrycount = 0;

	public boolean retry(ITestResult result) {
		
	if(!result.isSuccess() &&  retrycount < maxRetry) {
		retrycount++;
		return true;	
	}
	    return false;
	}

}
