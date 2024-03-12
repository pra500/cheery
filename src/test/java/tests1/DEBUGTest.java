package tests1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DEBUGTest {

	WebDriver driver;

	@Test
	public void getTest() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.testyou.in/Login.aspx");

		System.out.println(driver.getClass());

		System.out.println(driver.getCurrentUrl());

	}

	@Test
	public void getyyTest() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.testyou.in/Login.aspx");

		System.out.println(driver.getClass());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("ctl00_CPHContainer_txtUserLogin")).sendKeys("eu.placerat@aol.net");

		driver.findElement(By.id("ctl00_CPHContainer_txtPassword")).sendKeys("oddd@234");

	}

	@Test
	public void gettTest() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.testyou.in/Login.aspx");

		WebElement wb = driver
				.findElement(By.xpath("//div[@id='ctl00_CPHHeader_dvTestCategory']//div[@class='menu_unselected']"));
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();

	}

}
