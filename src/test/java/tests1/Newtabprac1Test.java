package tests1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Newtabprac1Test {
	
	WebDriver driver;
	
  @Test
  public void fTest() {
	  
	  
	  driver=new ChromeDriver();	  
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.google.com");		
		
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("auto");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		//driver.switchTo().newWindow(WindowType.WINDOW.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW.WINDOW);
		driver.get("https://practicetestautomation.com/practice-test-login/");
		String title=driver.getTitle();
		Assert.assertEquals(title, "Test Login | Practice Test Automation");
		
		String child=driver.getWindowHandle();
		System.out.println(child);
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.name("q")).sendKeys("auto1");
		driver.close();
		
		
		
		
		
		
  }
}
