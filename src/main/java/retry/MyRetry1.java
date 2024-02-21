package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry1  implements IRetryAnalyzer{
	int count=0;
	int limit=3;


	@Override
	public boolean retry(ITestResult result) {		
		
		if(count<limit)
		{
			count++;
			return true;
		}
	
		return false;
	}
	
	

}
