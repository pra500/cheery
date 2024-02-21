package tests1;

import org.testng.annotations.Test;

import utilities.Listenersss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@Listeners(utilities.Listenersss.class)
public class NewTabTest extends Listenersss{	
	//ll chk again
	
	
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fTest() {
	
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Practice Page");
	  
	  
	WebElement wb=driver.findElement(By.xpath("//a[@id='opentab']"));
	wb.sendKeys("Keys.CONTROL" + "t");
	opentab(driver);
	
	
	
	
	
	  
	  
  }
  
  public void opentab(WebDriver driver)
  {
	  Set<String> set1=driver.getWindowHandles();
	  for(String ss:set1)
	  {
		  driver.switchTo().window(ss);
	  }
	  
	  System.out.println(driver.getTitle());
	  driver.close();
	  
  }
  

  


  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
  }
  
  @AfterClass
  public void teardown()
  {
	  
	  
	  driver.quit();
	  
  }


}
