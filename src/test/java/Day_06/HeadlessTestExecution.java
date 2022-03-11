package Day_06;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestExecution {
	@Test
	public void TC1() {
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.addArguments("Headless");
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(chromeOptions);
		
		driver.get("https://www.google.com/"); 
		System.out.println(driver.getTitle());
		driver.close();
	}
	
	
	
}
