package withoutselecttag;

import org.testng.annotations.Test;

import utilities.Listenersss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@Listeners(utilities.Listenersss.class)
public class Mukesh551Test extends Listenersss{
	
	
	//will check later
	
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fTest() {
	 
	  
	  driver.findElement(By.xpath("//select")).click();
	  List<Webele>                             driver.findElements(By.xpath("//select//option"));
	  
	 

	  
  }
  
	
  
  @BeforeClass
  public void setup() {
	  
	  driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		
  }
  
  
  @AfterClass
  public void teardown() {
	  
	  driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		
		
  }
  
  

}
