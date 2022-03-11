package Day_05;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProvider1 {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void loginTest(String username, String password)  {
	  System.out.println(username+"-----"+password);
	  	driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("submit")).click();
		
		  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterMethod
  public void afterMethod() {
	 driver.close();
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "manesh", "manesh007" },
      new Object[] { "manesh", "" },
      new Object[] { "ma", "manesh007" },
      new Object[] { "manish", "manish007" },
    };
  }
}
