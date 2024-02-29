package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SelectwithoutselecttagTest {
	
	
	WebDriver driver;
	
	
	
	
  @Test
  public void fTest() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("//select")).click();
	  
	  List<WebElement>list=driver.findElements(By.xpath("//select//option"));
	  	  
	  for(int i=0;i<=list.size()-1;i++)
	  {
		  if(list.get(i).getText().equalsIgnoreCase("Highest to lowest"))
		  {
			  list.get(i).click();
		     break;
		  }
	  }
	  
	 
	 
  }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
        driver=new ChromeDriver();	  
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.bstackdemo.com/");
		
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
