package pom.Framework;

import static org.junit.Assert.*;

//import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;				// not working for login only
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.Framework.*;


public class RegisterTest {
	 WebDriver driver;
	 FileInputStream file;
	 Properties prop;
	 HomePageClass hp;
	 RegisterPage rp;
	 LoginPageClass lpc;
	
	@Before
	public  void beforeClass() throws IOException {
		// create object for properties class
		file=new FileInputStream(new File("C:\\Users\\LENOVO\\eclipse-workspace\\LTIWebDriverTest\\confiq.properties"));
		prop=new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromebrowserpath"));
		driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		// create object for home page and register page
		hp=new HomePageClass(driver);
		rp=new RegisterPage(driver);
		lpc=PageFactory.initElements(driver,LoginPageClass.class );
	}
	@After
 public  void afterClass() {
		driver.close(); 
	}
	@Test
	public void register() {
		
		hp.click_Register();
		rp.register_male("manesh", "lokare", "ganish0002@gmail.com", "manesh", "manesh");
	String text= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]")).getText();
	Assert.assertEquals("completed", text);
	assertTrue(text.contains("completed"));
	driver.findElement(By.linkText("Log out")).click();
	}
	@Test 
	public void loginTC() {
		hp.click_Login();
		lpc.login("maneshlokare007@gmail.com", "manesh007");
		
	}

}
