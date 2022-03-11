package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWait2 {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// open application 
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.findElement(By.linkText("Flights")).click();
		
		//wait for 20 sec to locate oneway trip on the screen
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value=;oneway']")));
		
		driver.close();
		
	
	
	
	}
}
