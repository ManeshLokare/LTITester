package Day_05;

import org.junit.After;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit1 {
	WebDriver driver;

	@Test
	public void testcase1() {
		
		System.out.println("test case 1");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();     
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("manesh");
		driver.findElement(By.name("LastName")).sendKeys("lokare");
		driver.findElement(By.name("Email")).sendKeys("manesh12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("manesh007");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("manesh007");
		driver.findElement(By.name("register-button")).click();
		//check registration success or not
		String actuslresult=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText();
		Assert.assertEquals("Register", actuslresult);

	}
	@Test
	public void testcase2() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manesh12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("manesh007");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@Before
	public void before() {
	System.out.println("before condition");
	System.setProperty("webdriver.chrome.driver",
			"E:\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	
	
}
@After
public void after() {
	System.out.println("after condition");
	driver.close();
}
		
	}

