package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class WindowHandlingTest {
	
	//need to check code again 
	
	WebDriver driver;
	
  @Test
  public void fTest() throws InterruptedException {
	  System.out.println("parent title");
	  
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Demo Site']")).click();
	  
	  Set<String> set1=driver.getWindowHandles();
	  
  Iterator<String> itr1=set1.iterator();
  String parent=itr1.next();
  String child=itr1.next();
  
  driver.switchTo().window(child);
    
 
  System.out.println("child title");
  Thread.sleep(6000);
  System.out.println(driver.getTitle());
  driver.close();
  driver.switchTo().window(parent);
  
  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/testng/testng-dependent-tests/");
	   
	  
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
  }

}
