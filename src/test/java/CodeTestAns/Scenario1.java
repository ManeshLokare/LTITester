package CodeTestAns;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	WebDriver driver;
	@Test
	public void TC1() {
		WebElement searchbox=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div/div[2]/input"));
		WebElement searchbutton=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		assertTrue(searchbox.isDisplayed());
		assertTrue(searchbutton.isDisplayed());
	}
	@Test
	public void TC2() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("testing");
	//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[2]")).getText();
	}
	@Test
	public void TC3() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		assertTrue(driver.getTitle().contains("Google"));
	}
	@Test
	public void TC4() {
	List <WebElement> links=driver.findElements(By.tagName("a"));
	assertTrue(links.size()>=1);
	}	
	//or
	@Test
	public void TC5() {
		int linksize=driver.findElements(By.tagName("a")).size();
		assertTrue(linksize>0);
	}
	
	
	@Before 
	public void beforeTC1() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@After
	public void afterTC1() {
		driver.close();
	}
	

}
