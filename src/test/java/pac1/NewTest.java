package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {

	Properties prop;
	WebDriver driver;

	@Test
	public void bTest() throws IOException {

		String filepath = "C:\\Users\\Admin\\eclipse-workspace\\selfpractice\\src\\test\\java\\pac1\\config.properties";
		FileInputStream fip = new FileInputStream(filepath);
		prop = new Properties();
		prop.load(fip);
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/signup");

	}

}
