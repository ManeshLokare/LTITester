package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoApp1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		// open application 
		driver.get("https://demo.guru99.com/test/newtours/");
		// manage the browser
		driver.manage().window().maximize();
		// enter username
		driver.findElement(By.name("userName")).sendKeys("manesh");
		// enter password
		driver.findElement(By.name("password")).sendKeys("manesh007");
		// click on submit
		driver.findElement(By.name("submit")).click();
		// click on flights
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(10000);
		//click on oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		//select passenger value from dropdown
		Select p= new Select(driver.findElement(By.name("passCount")));
		p.selectByIndex(3);
		// select from 
		Select d= new Select(driver.findElement(By.name("fromPort")));
		d.selectByVisibleText("London");
		//select on
		Select e= new Select(driver.findElement(By.name("fromMonth")));
		//e.selectByVisibleText("May");
		e.selectByIndex(2);
	
		Select f=new Select(driver.findElement(By.name("fromDay")));
		f.selectByIndex(14);
		// select arriving in
		Select g=new Select(driver.findElement(By.name("toPort")));
		g.selectByVisibleText("New York");
		//select returning
		Select h=new Select(driver.findElement(By.name("toMonth")));
		//h.selectByVisibleText("October");
		h.selectByIndex(8);
		Select i=new Select(driver.findElement(By.name("toDay")));
		i.selectByIndex(6);
		// select service class
		driver.findElement(By.xpath("//input[@value='First']")).click();
		// select airline
		Select n=new Select(driver.findElement(By.name("airline")));
		n.selectByVisibleText("Unified Airlines");
		// search flight
		driver.findElement(By.name("findFlights")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
