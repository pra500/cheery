package tests1;

import org.testng.annotations.Test;

//import li.mylist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


//@Listeners(li.mylist.class)
//public class DependsonmethodsTest extends mylist{
public class DependsonmethodsTest{
	  WebDriver driver;
	
  @Test(priority = 0)
  public void feTest() {
	  
	 driver = new ChromeDriver();

      // Navigate to the login page
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.manage().window().maximize();	 
      driver.get("https://toolsqa.com/testng/testng-dependent-tests/");

    System.out.println(driver.getClass());
    
    

  }
  
  
  
  @Test(priority = 1, dependsOnMethods = {"feTest"})
  public void f6Test() {
	  
	  System.out.println(driver.getTitle());
	  
  }
  
  
  @Test(priority = 2, dependsOnMethods = {"feTest", "f6Test"})
  public void f5Test() {
	  
	  List<WebElement> list= driver.findElements(By.tagName("a"));
	  System.out.println(list.size());
	  
	  
  }
  
  @Test(priority = 3, dependsOnMethods = {"feTest", "f6Test", "f5Test"})
  public void f9Test() {
	  
	String url=driver.getCurrentUrl();
	Assert.assertEquals(url, "https://toolsqa.com/testng/testng-depende88nt-tests/");
	  
  }
  
 
  

}
