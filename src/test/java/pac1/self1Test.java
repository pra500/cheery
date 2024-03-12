package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class self1Test {

	WebDriver driver;

	@Test(priority = 0)
	public void fTest() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Courses']")).sendKeys(Keys.ENTER);

		WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();

	}
	
	
	
	@Test(priority = 1, dependsOnMethods = {"fTest"})
	public void fkTest() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Courses']")).sendKeys(Keys.ENTER);

		WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
		
	}
	
	
	@Test(priority = 2, invocationCount = 3, dependsOnMethods = {"fTest"})
	public void fkjTest() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Courses']")).sendKeys(Keys.ENTER);

		WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
		
	}
	
	
	@Test(priority = 2, invocationCount = 4, dependsOnMethods = {"fTest"})
	public void f90Test() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Cou']")).sendKeys(Keys.ENTER);

		WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
		
	}
	
	
	@Test(priority = 2, dependsOnMethods = {"fTest"})
	public void fkjlTest() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Courses']")).sendKeys(Keys.ENTER);

		WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Blogk']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();
		
		
	}
	
	
	
	@Test(priority = 2, dependsOnMethods = {"fTest"})
	public void n1Test() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[normalize-space()='Course']")).sendKeys(Keys.ENTER);

		WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
		Actions act = new Actions(driver);
		act.contextClick(wb).build().perform();		
		
	}
	
	
	
	
	
	

	@BeforeClass
	public void beforeClass() throws IOException {

		String path = "C:\\Users\\Admin\\eclipse-workspace\\selfpractice\\src\\main\\java\\utilities\\fg.properties";
		FileInputStream fip = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fip);

		String url = prop.getProperty("url");
		String browser = prop.getProperty("browser");

		if (browser.equalsIgnoreCase("chrome"))
			;
		{
			driver = new ChromeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	
	
	
	@AfterClass
	public void afterClass() {

		driver.close();

	}

}
