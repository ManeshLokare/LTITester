package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		
		// launch chrome driver...
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		// instantiate ChromeDriver class
		WebDriver driver= new ChromeDriver();
		
		// launch website
		driver.navigate().to("https://demo.guru99.com/test/newtours/");
		//driver.get("application url link");
		// click on register
		driver.findElement(By.linkText("REGISTER")).click();
		
		// textbook element
		// click on username
		driver.findElement(By.name("email")).sendKeys("manesh");
		// click on password
		driver.findElement(By.name("password")).sendKeys("manesh007");
		//click on confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("manesh007");
		
		// button element
		// click on submit 
		driver.findElement(By.name("submit")).click();
		 
		 //close the browser
		driver.close();
		
		
		
		
		
		
		
		
		

	}

}
