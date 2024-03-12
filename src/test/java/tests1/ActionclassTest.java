package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ActionclassTest {
	
	
	
	WebDriver driver;
	
  @Test
  public void frTest() {
	  System.out.println(driver.getTitle());
	  
	  
  }
  
  @Test
  public void fr2Test() {
	  
	  
	  System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void fr3Test() {
	  
	  System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void fr4Test() {
	  
	  System.out.println(driver.getTitle());
	  
  }
  
  @Test
  public void fr5Test() {
	  System.out.println(driver.getTitle());
	  
	  
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
	  
	  driver.quit();
	  
  }

}
