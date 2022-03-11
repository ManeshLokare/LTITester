package CodeTestAns;

import org.junit.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario3 {
		WebDriver driver;
	@Test
	public void TC1() {
		driver.findElement(By.linkText("Register")).click();
		Select title=new Select (driver.findElement(By.name("title")));
		title.selectByIndex(0);
		driver.findElement(By.name("firstname")).sendKeys("manesh");
		driver.findElement(By.name("lastname")).sendKeys("lokare");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		Select year=new Select(driver.findElement(By.name("year")));
		year.selectByValue("1960");
		Select month=new Select(driver.findElement(By.name("month")));
		month.selectByIndex(4);
		Select day=new Select(driver.findElement(By.name("date")));
		day.selectByValue("15");
		driver.findElement(By.name("licencetype")).click();
		Select lincence=new Select(driver.findElement(By.name("licenceperiod")));
		lincence.selectByIndex(1);
		Select occupation=new Select(driver.findElement(By.name("occupation")));
		occupation.selectByIndex(12);
		driver.findElement(By.name("street")).sendKeys("natoshi");
		driver.findElement(By.name("city")).sendKeys("satara");
		driver.findElement(By.name("county")).sendKeys("india");
		driver.findElement(By.name("post_code")).sendKeys("patan");
		driver.findElement(By.name("email")).sendKeys("manesh007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("manesh007");
		driver.findElement(By.name("c_password")).sendKeys("manesh007");
		driver.findElement(By.name("submit")).click();
	}
	@Test 
	public void TC2() {
		driver.findElement(By.name("email")).sendKeys("manesh007@gmail.com");
		driver.findElement(By.name("password")).sendKeys("manesh007");
		driver.findElement(By.name("submit")).click();

	}
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		Thread.sleep(3000);
	}
	@After
	public void after() {
		driver.close();
	}
	
	
	
	
}
