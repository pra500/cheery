package tests1;

import org.testng.annotations.Test;

//import li.mylist;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Newtabopening33Test {
	
	//not full code

	WebDriver driver;

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/testng/testng-dependent-tests/");

	}

	@Test(priority = 0)
	public void f6Test() {
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("t").build().perform();
		
		driver.get("https://www.browserstack.com/guide/handling-tabs-in-selenium");
	}
	
	
	

}
