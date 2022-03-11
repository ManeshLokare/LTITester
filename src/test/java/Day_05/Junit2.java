package Day_05;

import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit2 {
	WebDriver driver;
	@Test
	public void testcase1() {
		WebElement resisterlink=driver.findElement(By.linkText("Register"));
		WebElement loginlink=driver.findElement(By.linkText("Log in"));
		assertTrue(resisterlink.isDisplayed());
		assertTrue(loginlink.isDisplayed());
		
	}
	@Test
	public void testcase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("maneshl123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("manesh007");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//verify login succeess
		String email=driver.findElement(By.linkText("maneshl123@gmail.com")).getText();
		Assert.assertEquals("maneshl123@gmail.com", email);
		assertTrue(driver.findElement(By.linkText("maneshl123@gmail.com")).isEnabled());
	}
	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
	}
	@After
	public void after() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
