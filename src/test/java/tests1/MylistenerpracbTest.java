package tests1;

import org.testng.annotations.Test;

import utilities.Listenersss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;




@Listeners(Listenersssss.Lis111.class)
public class MylistenerpracbTest extends Listenersss{
	
	
	
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fTest() {
	 
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Co");
	  
	  
  }
  
	
  @Test(priority = 1)
  public void f22Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Courses");
	  
	  
  }
  
	
  @Test(priority = 0)
  public void fyTest() {
	 
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automatio");
	  
	  
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
  
  

}
