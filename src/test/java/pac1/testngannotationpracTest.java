package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class testngannotationpracTest {
	
	
	
	//need to chk later
	WebDriver driver;

	
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Tools']")).isDisplayed();
	  
	//a[normalize-space()='About']
	  
  }
  
  @Test(priority = 1)
  public void abTest() {
	  
	  driver.findElement(By.xpath("//a[normalize-space()='About']")).isDisplayed();
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.id("username")).sendKeys("practice");
	  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  
	  driver.findElement(By.xpath("//h1[normalize-space()='Secure Area']")).isDisplayed();

	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.findElement(By.xpath("//a[normalize-space()='Contact']")).isDisplayed();
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practice.expandtesting.com/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
