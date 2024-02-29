package tests1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Retryprac1111Test {
	
	
	//need to chk later
	
	
	
	 WebDriver driver;
	 
	 
	@BeforeClass
	public void set()
	{
		
		  // Navigate to the login page
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	 
	      driver.get("https://toolsqa.com/testng/testng-dependent-tests/");
		
		
	}
	
  @Test(priority = 0)
  public void fTest() {
	
	  
	 boolean b= driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Home']")).isDisplayed();
	System.out.println(b);
  }
  
	
  @Test(priority = 1)
  public void f22Test() {
	  
		 boolean b= driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex1']//a[normalize-space()='Home']")).isDisplayed();
		System.out.println(b);
	 
	  
  }
  
  @AfterClass
  public void tear()
  {
	  
	  driver.close();
	  
  }
}
