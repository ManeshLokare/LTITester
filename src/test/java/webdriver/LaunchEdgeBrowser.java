package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class LaunchEdgeBrowser {

	public static void main(String[] args) {

		// launch chrome driver...
				System.setProperty("webdriver.edge.driver", 
						"");
				
				// instantiate ChromeDriver class
				WebDriver driver= new EdgeDriver();
				
				// launch website
				driver.navigate().to("https://www.javatpoint.com/selenium-tutorial");

	}

}
