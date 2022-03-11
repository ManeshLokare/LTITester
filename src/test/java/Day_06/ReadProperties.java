package Day_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {
	static WebDriver driver;
	static FileInputStream file;
	static Properties prop;
	
	@BeforeClass
	public static void beforeClass() throws IOException {
		// create object for properties class
		file=new FileInputStream(new File("C:\\Users\\LENOVO\\eclipse-workspace\\LTIWebDriverTest\\confiq.properties"));
		prop=new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromebrowserpath"));
		driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(prop.getProperty("applictionurl"));
		
	}
	@AfterClass
public static void afterClass() {
		driver.close(); 
	}
	@Test
	public void Testcase1() {
		driver.findElement(By.name("userName")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
	
		
	}
}
