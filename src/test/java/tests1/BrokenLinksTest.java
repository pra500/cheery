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
	
	
	WebDriver driver;
	
  @Test(priority = 0)
  public void fTest() throws IOException {
	  
	  
	  
	// List <WebElement> list=driver.findElements(By.tagName("a"));
	 List <WebElement> list=driver.findElements(By.tagName("img"));
	 
	 
	 System.out.println(list.size());
	 for(WebElement wb:list)
	 {
		
		// String url=wb.getAttribute("href");
		 String url=wb.getAttribute("src");
		 gettt(url);
		 
	 }  
	
	  
  }
  
    
  
  
  
  
 public void gettt(String u) throws IOException
 {
	 
	 
	 
	 URL ur=new URL(u);
	 
	 HttpURLConnection hp=(HttpURLConnection) ur.openConnection();
	 hp.connect();
	 int  code=hp.getResponseCode();
	 
	 if(code==200)
	 {
		 //System.out.println("br not");
		 System.out.println("img not");
	 }
		
	 else
	 {
		 //System.out.println("br");
		 System.out.println("img");
	 }
			 
 }
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  
	  driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://toolsqa.com/testng/testng-dependent-tests/");
		
		
  }
  
  
  
  

  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
	  
  }

}
