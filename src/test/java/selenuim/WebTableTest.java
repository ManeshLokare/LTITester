package selenuim;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
		// fetch no of column
		//*[@id="leftcontainer"]/table/thead/tr/th[1] 
		List<WebElement> column=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("column Size is:"+column.size());
		//fetch no of row
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		List<WebElement>row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("row size is:"+row.size());
		//fetch specific data from cell
		String cell= driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println("cell data is :"+cell);
		
		if (cell.equals(cell)) {
			System.out.println("data is currect");
		}else{System.out.println("data is incorrect");}
		// check top company
		String topcomp=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("topcompany is :"+topcomp);
		// check top 5 company
		for(int i=1;i<=5;i++) {
			String list=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println("top5company is :"+list);
		}
		driver.close();

		

		
		
		
		
		
	
	}

}
