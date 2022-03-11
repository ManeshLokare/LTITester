package selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.findElement(By.linkText("Droppable"));
		//for mouse and keyboard actions

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		Actions act=new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("droppable"))).build().perform();
		
		
		
		
		
		

	}

}
