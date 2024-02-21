package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BrokenLinksTest {
	
	//need to chk the code
	WebDriver driver;
	
  @Test(priority = 0)
  public void fTest() {
	  
	  
	  
	 System.out.println(driver.getTitle());
	  
  }
  
  
  @Test(priority = 1, dependsOnMethods = {"fTest"})
  public void f2Test() throws IOException {
	  
	  List<WebElement>   links=  driver.findElements(By.tagName("a"));
	  for(WebElement wb:links)
	  {
		  String url=wb.getAttribute("href");
		  brokenvalidation(url);
		  
	  }
	  
	  
	  
  }
  
  
  
  
  public void  brokenvalidation(String u) throws IOException
  {
	  
	  
	  URL ur=new URL(u);
	  
	  HttpURLConnection hp=(HttpURLConnection)ur.openConnection();
	  hp.connect();
	  
	  
	  
	  
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
