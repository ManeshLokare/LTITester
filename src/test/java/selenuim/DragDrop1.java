package selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		
		WebElement src= driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement target= driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		
		WebElement src1= driver.findElement(By.xpath("//div[@id='products']/div/ul/li[5]/a"));
		WebElement target1= driver.findElement(By.xpath("//*[@id=\"bank\"]"));

		WebElement src2= driver.findElement(By.xpath("//*[@id=\"credit1\"]"));
		WebElement target2= driver.findElement(By.xpath("//*[@id=\"loan\"]"));
		
		WebElement src3= driver.findElement(By.xpath("//div[@id='products']/div/ul/li[2]/a"));
		WebElement target3= driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
		

		//act.dragAndDrop(src, target).build().perform();
		act.clickAndHold(src).release(target).build().perform();
		act.clickAndHold(src1).release(target1).build().perform();
		act.clickAndHold(src2).release(target2).build().perform();
		act.clickAndHold(src3).release(target3).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
