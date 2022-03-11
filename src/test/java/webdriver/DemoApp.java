package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/"); 
		
		driver.findElement(By.linkText("Register")).click();     
	
		driver.findElement(By.id("gender-male")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("manesh");
		
		driver.findElement(By.name("LastName")).sendKeys("lokare");
		
		driver.findElement(By.name("Email")).sendKeys("maneshlokare7@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("manesh007");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("manesh007");
		
		driver.findElement(By.name("register-button")).click();
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
