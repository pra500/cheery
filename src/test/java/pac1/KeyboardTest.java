package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class KeyboardTest {
	
	
	
	
	
	WebDriver driver;
  @Test
  public void fTest() throws InterruptedException {
	  
	  System.out.println(driver.getCurrentUrl());
	   
	  WebElement wb=driver.findElement(By.id("input-firstname"));
			  wb.sendKeys("Tom", Keys.CONTROL, "A", "C");
			  
			  Thread.sleep(4000);
			  
			  wb.sendKeys(Keys.TAB);
			  
			  
			  			 			  
			  WebElement wb1=driver.findElement(By.id("input-lastname"));	  
			  
			  wb1.sendKeys(Keys.CONTROL, "V");
			  
			
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
