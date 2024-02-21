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
import org.testng.annotations.AfterClass;

public class Newtabopening34Test {

	WebDriver driver;

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/testng/testng-dependent-tests/");
	}

	@Test
	public void setyt() {

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());

	}

	@Test
	public void sett8() {

		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println(list.size());

	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}

}
