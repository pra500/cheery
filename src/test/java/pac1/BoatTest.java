package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BoatTest {
	
	
	
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
  }
  
  @Test
  public void ftTest() {
	  
	 System.out.println(driver.getTitle());
	 
	 try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 JavascriptExecutor js =(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(180, 188)", "");
	 
	 
	 
	 
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	    driver=new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");

  }

  @AfterClass
  public void afterClass() {
	  
	 driver.close();
  }

}
