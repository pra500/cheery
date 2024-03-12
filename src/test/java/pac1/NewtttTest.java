package pac1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewtttTest {

	WebDriver driver;

	@Test(priority = 0)
	public void fTest() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();

	}

	@Test(priority = 1)
	public void f4Test() {

		List<WebElement> links = driver.findElements(By.tagName("img"));
		links.size();

	}

	@Test(priority = 2)
	public void f6Test() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();

	}

	@Test(priority = 3)
	public void f7Test() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();

	}

	@Test(priority = 4)
	public void f8Test() {

		driver.findElement(By.xpath("//input[@id='search-strings']")).sendKeys("Java", Keys.ENTER);

	}

	@Test(priority = 5)
	public void f9Test() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();

	}

	@Test(priority = 6)
	public void f10Test() {

		String title = driver.getTitle();

		Assert.assertEquals(title, "Search Video Courses, eBooks, Certifications and Learnig Paths");

	}

	@Test(priority = 7)
	public void foTest() {

		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();

	}

	@Test(priority = 8)
	public void fTfest() {

		driver.get("https://www.tutorialspoint.com/search/java");

		WebElement wb = driver.findElement(By.xpath("//img[@class='select__chevron']"));

		Select sel = new Select(wb);
		sel.selectByVisibleText("Best Seller");

	}

	@Test
	public void ffTest() {
		driver.get("https://www.tutorialspoint.com/search/java");
		driver.findElement(By.xpath("//label[normalize-space()='eBooks']//span[@class='checkmark']")).submit();

	}

	@Test
	public void ffssTest() {
		
		driver.get("https://www.tutorialspoint.com/search/java");
		
		boolean b=driver.findElement(By.xpath("//div[@id='ebook-button-card-5707']//a[@class='button video-course__full-w-button add_to_cart'][normalize-space()='Buy Now']//*[name()='svg']")).isDisplayed();
System.out.println(b);
	}

	@BeforeMethod
	public void setup() {

		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/how-to-run-tests-using-a-test-runner-file-for-cucumber");

	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}
}
