package pom.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;			// not working

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;


public class LoginPageWithDataProvider {
	 WebDriver driver;
	 FileInputStream file;
	 Properties prop;
	 HomePageClass lp;
	 RegisterPage rp;
	 LoginPageClass lpc;
	
	@BeforeClass
	public  void beforeClass() throws IOException {
		// create object for properties class
		file=new FileInputStream(new File("C:\\Users\\LENOVO\\eclipse-workspace\\LTIWebDriverTest\\confiq.properties"));
		prop=new Properties();
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromebrowserpath"));
		driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/register");
		// create object for home page and register page
		lp=new HomePageClass(driver);
		rp=new RegisterPage(driver);
		lpc=PageFactory.initElements(driver,LoginPageClass.class );
	}
	@AfterClass
 public  void afterClass() {
		driver.close(); 
	}
	
	@Test(dataProvider = "dp")
	public void login(String email_id,String userpassword) {
		lp.click_Login();
		lpc.login(email_id,userpassword);
		if (driver.findElement(By.linkText("Log out")).isDisplayed()) {
			System.out.println("login success");
			lp.click_LogOut();
		}else {
			System.out.println("login unsuccess");
		}
		
	}
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	    	 new Object[] { "maneshl123@gmail.com", "manesh007" },
	         new Object[] { "maneshl123@gmail.com", "manesh007" },
	         
	    };

	 }
}
