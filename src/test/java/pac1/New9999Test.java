package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class New9999Test {

	// need to chk again second tc

	WebDriver driver;

	 @Test
	public void fTest() {

		// driver.findElement(By.xpath("//legend[normalize-space()='Suggession Class
		// Example']")).click();

		driver.findElement(By.xpath("//button[@id='openwindow']")).click();

		Set<String> set1 = driver.getWindowHandles();

		Iterator<String> itr1 = set1.iterator();

		String parent = itr1.next();
		String child = itr1.next();

		driver.switchTo().window(child);

		String title = driver.getTitle();

		Assert.assertEquals(title, "QAClick Academy - A Testing Academy to Learn, Earn and Shine");
		driver.close();

		driver.switchTo().window(parent);

		boolean b = driver.findElement(By.xpath("//legend[normalize-space()='Suggession Class Example']"))
				.isDisplayed();
		Assert.assertTrue(b);

	}

	//@Test
	public void fyTest() {

		driver.navigate().to("https://toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

		driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Demo Site']"))
				.click();

		Set<String> set1 = driver.getWindowHandles();

		Iterator<String> itr1 = set1.iterator();

		String par = itr1.next();
		String chi = itr1.next();

		driver.switchTo().window(chi);

		boolean b = driver.findElement(By.xpath("//img[@alt='Selenium Online Training']")).isDisplayed();
		Assert.assertTrue(b);

		driver.close();

		driver.switchTo().window(par);

		boolean b1 = driver
				.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Home']"))
				.isDisplayed();

		Assert.assertTrue(b1);

	}

	@BeforeClass
	public void beforeClass() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();
	}

}
