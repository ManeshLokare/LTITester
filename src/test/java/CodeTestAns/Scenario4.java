package CodeTestAns;

import static org.testng.Assert.*;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.stylesheets.LinkStyle;

public class Scenario4 {
	WebDriver driver; 
	@Test 
	public void TC1() {
	List<WebElement>list=driver.findElements(By.tagName("a"));
	
	System.out.println("no of Links are :"+list.size());
		assertTrue(list.size()>=1);
		
	}
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://jmeter.apache.org/");
		Thread.sleep(2000);
		
	}
	@After
	public void after() {
		driver.close();
	}
}
