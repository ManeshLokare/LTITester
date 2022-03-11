package Day_05;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
	WebDriver driver;

	@Test
	public void testcase1() {
		
		System.out.println("test case 1");
		driver.manage().window().maximize();
		// enter username
		driver.findElement(By.name("userName")).sendKeys("manesh");
		// enter password
		driver.findElement(By.name("password")).sendKeys("manesh007");
		// click on submit
		driver.findElement(By.name("submit")).click();
		//check login is success or not
	String actuslresult=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
	//String actuslresult=driver.findElement(By.xpath("//h3[contains(text(),'Login Sucessfully']")).getText();
	Assert.assertEquals("Login Successfully", actuslresult);
	
	}
	@Test
	public void Testcase2() throws InterruptedException{
		System.out.println("Fligths search");
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(5000);
		//check title is right or not
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Find a Flight: Mercury Tours:", title);
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
	}
	
	@Before
	public void before() {
		System.out.println("before condition");
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
	}
	@After
	public void after() {
		System.out.println("after condition");
		driver.close();
	}

}
