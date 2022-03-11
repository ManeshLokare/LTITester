package selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		String title=driver.getTitle();
		System.out.println("title is :"+title);
		//check title of web is equal or not
		if(title.equals(title)) {
			System.out.println("title is correct");
		}
		// fetch current URL
		System.out.println(driver.getCurrentUrl());
		// fetch html source of page
		System.out.println(driver.getPageSource());
		//move back
		driver.navigate().back();
		//move forward
		driver.navigate().forward();
		//refresh the page
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
