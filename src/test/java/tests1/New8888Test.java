package tests1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class New8888Test {

	WebDriver driver;

	@Test(priority = 0)
	public void fTest() {

		driver.getCurrentUrl();

	List<WebElement> links = driver.findElements(By.tagName("//a"));

		System.out.println(links.size());

		List<WebElement> links1 = driver.findElements(By.tagName("//img"));

		System.out.println(links1.size());

		List<WebElement> links3 = driver.findElements(By.tagName("//div"));

		System.out.println(links3.size());
		
		

	}

	@Test(priority = 1)
	public void fiTest() {

		boolean b = driver.findElement(By.xpath("//a[@id='ctl00_CPHHeader_HyperLink1']")).isDisplayed();
		Assert.assertEquals(b, true);

		WebElement eb = driver.findElement(By.xpath("//div[@class='searchbtn_header']"));
		eb.click();

		WebElement wb = driver.findElement(By.xpath("//input[@id='ctl00_CPHHeader_he1_txtSearch']"));
		wb.sendKeys("test", Keys.ENTER);

	}

	@Test(priority = 2)
	public void fooTest() {

		boolean b = driver.findElement(By.xpath("//div[@class='grid_7 logo pull_1']")).isDisplayed();
		Assert.assertEquals(b, true);
		
		

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.testyou.in/Login.aspx");

	}

	@AfterClass
	public void afterClass() {

		 driver.close();		
		//driver closed
		//driver closed
		//driver closed
		//driver closed***********

	}

}
