package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("Email")).sendKeys("maneshlokare007@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("manesh007");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		// type element
		//driver.findElement(By.id("small-searchterms")).sendKeys("Build your own cheap computer");
		// serch type element
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.linkText("Build your own cheap computer")).click();
		driver.findElement(By.xpath("//input[@value='65']")).click();
		driver.findElement(By.xpath("//input[@value='91']")).click();
		driver.findElement(By.xpath("//input[@value='58']")).click();
		driver.findElement(By.xpath("//input[@value='93']")).click();
		driver.findElement(By.xpath("//input[@value='94']")).click();
		driver.findElement(By.xpath("//input[@value='95']")).click();
		driver.findElement(By.id("add-to-cart-button-72")).click();
		
		
		
		
		
		
		


		
		
		
		
		

	}

}
