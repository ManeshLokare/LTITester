package CodeTestAns;

import static org.testng.Assert.assertTrue;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario2 {
	WebDriver driver;
	@Test
	public void TC1() {
		driver.findElement(By.name("btnLogin")).click();	
		driver.switchTo().alert().accept();
		System.out.println("Alert handled");
	}
	@Test
	public void TC2() {
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		Select accountno=new Select(driver.findElement(By.name("accountno")));
	    accountno.selectByVisibleText("3309");
	    driver.findElement(By.name("AccSubmit"));
		
	}
	@Test
	public void TC03()
	{
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		String title=driver.getTitle();
		Assert.assertEquals("Guru99 Bank Customer HomePage",title);
	}
	@Test
	public void TC04()
	{
		driver.findElement(By.name("uid")).sendKeys("1303");
		driver.findElement(By.name("password")).sendKeys("Guru99");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Mini Statement")).click();
		WebElement driverElement=driver.findElement(By.linkText("Home"));
		assertTrue(driverElement.isDisplayed());
		
		/*if(driver.findElement(By.linkText("Home")).isDisplayed())
		{
	System.out.println("The link is there");
		}
else
{
	System.out.println("The link is not there");
}*/
	}
	
	
	@Before
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		Thread.sleep(10000);
	}
	@After
	public void after() {
		driver.close();
	}
	
	

}
