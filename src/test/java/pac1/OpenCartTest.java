package pac1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class OpenCartTest {

	WebDriver driver;

	@Test
	public void fTest() {

		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("samsung", Keys.ENTER);

		String text = driver.findElement(By.xpath("//input[@id='input-search']")).getText();
		System.out.println(text);

		WebElement wb = driver.findElement(By.xpath("//select[@name='category_id']"));

		Select sel = new Select(wb);
		sel.selectByVisibleText("Desktops");
		
		
		driver.findElement(By.xpath("//input[@id='button-search']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Samsung SyncMaster 941BW']")).click();
			
		

	}
	
	
	@Test
	public void f1Test()
	{
		
		String str="IncomeTaxProvision";
		String[] arr=str.split(" ");
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		for(String ch:arr)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,  1);
			}
		}
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://naveenautomationlabs.com/opencart/");

	}

	@AfterClass
	public void teardown() {

		driver.close();

	}

}
