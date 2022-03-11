package Day_05;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG2 {
	WebDriver driver;
  @Test(priority = 1)
  public void login() {
	  driver.manage().window().maximize();
		// enter username
		driver.findElement(By.name("userName")).sendKeys("manesh");
		// enter password
		driver.findElement(By.name("password")).sendKeys("manesh007");
		// click on submit
		driver.findElement(By.name("submit")).click();
  }
  @Test(priority = 2,enabled = false)
  public void flightSearch() throws InterruptedException {
	  driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
