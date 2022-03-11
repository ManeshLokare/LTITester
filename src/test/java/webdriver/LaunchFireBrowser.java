package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFireBrowser {

	public static void main(String[] args) {
		
		// launch chrome driver...
		System.setProperty("webdriver.gecko.driver", 
				"");
		
		// instantiate ChromeDriver class
		WebDriver driver= new FirefoxDriver();
		
		// launch website
		driver.navigate().to("https://www.javatpoint.com/selenium-tutorial");


	}

}
