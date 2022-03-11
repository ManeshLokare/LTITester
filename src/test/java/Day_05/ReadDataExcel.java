package Day_05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.*;

public class ReadDataExcel {
	static WebDriver driver;
  @Test
  public void loginTest() throws IOException,InterruptedException {
	 
	  //read data from excel
	 FileInputStream fis= new FileInputStream(new File("D:\\Selenuim\\LoginData.xlsx"));
	  //access workbook
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  //access worksheet
	  XSSFSheet sh=wb.getSheet("Sheet1");
	  
		System.out.println("no of row is:"+sh.getPhysicalNumberOfRows());	
		for (int i=1;i<sh.getPhysicalNumberOfRows();i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(username+"---"+password);
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("submit")).click();
			
			if (driver.getTitle().contains("Login")){
				System.out.println("valid credential");	
				driver.findElement(By.linkText("SIGN-OFF")).click();
		}else {
			System.out.println("invalid credential");	}

		
		}
	  
  }
  @BeforeClass
  public static void  beforeClass()  {
	  System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Thread.sleep(5000);
		driver.get("https://demo.guru99.com/test/newtours/");
  }

  @AfterClass
  public static void afterClass() {
	driver.close();  
  }

}
