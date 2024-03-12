package retryyyyyyy;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry111 implements IRetryAnalyzer{

	
	@Override
	public boolean retry(ITestResult result) {
	int count=0;
	int limit=3;
	
	
		if(count<limit)
		{
			count++;
				return true;
				
			}		
		
		
		return false;
		
		//*************
	}

}
