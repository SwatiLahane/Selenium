package day_52_12sep_DataDriven;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed_Testcases implements IRetryAnalyzer
{
    
	int current_count = 0;
	int noofretry = 2;
	
	@Override
	public boolean retry(ITestResult result)
	{
		
		if(current_count < noofretry)
		{
			current_count++;
			return true; //give retry
		}
		return false; //dont retry
	}
	
	
	
	
}
