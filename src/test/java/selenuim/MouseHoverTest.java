package selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement computers=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]"));
		WebElement accessories=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(computers)
		.moveToElement(accessories)
		.click()
		.build().perform();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
