package tests1;

import org.testng.annotations.Test;

import utilities.Listenersss;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;



public class Verbose1Test {
	
	WebDriver driver;
	
	
	
  @Test(priority = 0)
  public void fTest() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");
	  
	  
  }
  
	
  @Test(priority = 1)
  public void f22Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");
	  
	  
  }
  
	
  @Test(priority = 2)
  public void f23Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");
	  
	  
  }
  
	
  @Test(priority = 3)  
  public void f24Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");
	  
	  
  }
  
	
  @Test(priority = 4, dependsOnMethods = "f24Test")  
  public void f25Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");
	  
	  
  }
  
	
  @Test(dependsOnMethods = {"f25Test"})   
  public void f26Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String title= driver.getTitle();
	  Assert.assertEquals(title, "Learn Automation Coures");  
	  	  
  }
  
	
  @Test  
  public void f27Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String url= driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://freelance-learn-automation.vercel.app/signup");
	  
	  
  }
  
	
  @Test  
  public void f28Test() {
	  
	driver.get("https://rahulshettyacademy.com/practice-project");
	System.out.println(driver.getTitle());
	
	
	
  }
  
	
  @Test  
  public void f29Test() {
	  
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("tom44");
	 String url= driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://freelance-learn-automation.vercel.app/signup");
	  
	  
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
  public void afterClass()
  {
	  driver.close();
  }
  
  
  

}
