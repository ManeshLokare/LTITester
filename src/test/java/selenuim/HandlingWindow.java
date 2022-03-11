package selenuim;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		//get window id
		String oldpage=driver.getWindowHandle();
		System.out.println("currently open page window id is:"+oldpage);
		// click on click here link
		driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		//switch from old to new window
		Set<String> newpage=driver.getWindowHandles();
		
		for(String name:newpage) {
			driver.switchTo().window(name);
			System.out.println("currently new open page window id is:"+name);	}
		//enetremail id
		driver.findElement(By.name("emailid")).sendKeys("maneshlokare007@gmail.com");
		//click on submit
		driver.findElement(By.name("btnLogin")).click();
		
		// switch from new to old window
		//driver.switchTo().window(oldpage);
		
		//driver.close();......>close current open  tab
		//driver.quit(); // close all open tabs
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
