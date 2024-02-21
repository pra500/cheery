package tests1;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class log4jdemo1Test {

	Logger log = LogManager.getLogger(log4jdemo1Test.class);

	@Test
	public void fTest() {

		WebDriver driver;

		driver = new ChromeDriver();

		log.info("**********get*******");
		log.fatal("*************get1************");
		log.warn("**********get2*********");

		log.debug("*********get3***********");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freelance-learn-automation.vercel.app/signup");
	}
}
