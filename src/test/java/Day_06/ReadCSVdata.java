package Day_06;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;  			//Not Working....
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.junit.*;



public class ReadCSVdata {
	static WebDriver driver;
	@Test
	public void loginTC() throws IOException,CsvException,InterruptedException  {
		//locate CSV file
		CSVReader csvReader=new CSVReader(new FileReader("‪‪D:\\Selenuim\\LoginData.csv"));		
		String[] csvCell;
		//read all cell data from csv file
		while((csvCell=csvReader.readNext())!=null){
			String username=csvCell[0];
			String password=csvCell[1];
			System.out.println(username+"-----"+password);
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
	  public static void beforeClass()  {
		  System.setProperty("webdriver.chrome.driver",
					"E:\\chromedriver_win32\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			// Thread.sleep(5000);
			driver.get("https://demo.guru99.com/test/newtours/");
	  }

	  @AfterClass
	  public static void afterClass() {
		driver.close();  
	  }

}
