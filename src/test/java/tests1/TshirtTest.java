package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TshirtTest {
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	  driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shirt");
	  try {
		Thread.sleep(6000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  //driver.findElement(By.xpath("//span[@class='qs-option-name selected']")).click();
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Shirt for women']")).click();
	
	  
	 boolean value= driver.findElement(By.xpath("//span[@class='base']")).isDisplayed();
	 Assert.assertEquals(value, true);
	 
	 
	 driver.findElement(By.xpath("//div[normalize-space()='Category']")).click();
	 
	 driver.findElement(By.xpath("//a[normalize-space()='women T shirts']")).click();
	 
	 
	 WebElement wb=driver.findElement(By.xpath("//img[@alt='Zoe Tank']"));
	 Actions act=new Actions(driver);	  
	 act.moveToElement(wb).build().perform();
	 
	 
	 driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[4]//div[1]//div[1]//form[1]//button[1]//span[1]")).click();
	 driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
	 
	 
	 
	 
	
	 
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  
	  
driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		
		
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
