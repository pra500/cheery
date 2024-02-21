package tests1;

import org.testng.annotations.Test;

import utilities.Listenerfailed11111;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

@Listeners(utilities.Listenerfailed11111.class)
public class Screenshot2Test extends Listenerfailed11111{
	
	WebDriver driver;
	
	
  @Test
  public void fTest() {
	  
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/signup");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }

}
