package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Debugging1Test {
	
	
	
	
	 WebDriver driver;
	 

  
  @Test
  public void fttttTest() {
	  
	  System.out.println(driver.getTitle());
	  
	  
	  
  }
  
  @Test
  public void fuuTest() {
	  
	  
	 boolean b=driver.findElement(By.xpath("//div[contains(@class,'float_left clearfix')]//a//img")).isDisplayed();
	  System.out.println(b);
  }
  
    
  
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();	 
	      driver.get("https://www.testyou.in/Login.aspx");

	    System.out.println(driver.getClass());
	    
	    
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
