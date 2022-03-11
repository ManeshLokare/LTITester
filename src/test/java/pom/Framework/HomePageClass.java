package pom.Framework;

import org.openqa.selenium.*;

public class HomePageClass {
	WebDriver driver;
	 public HomePageClass(WebDriver driver) {
		 this.driver=driver;	
	}
	 //locators
	 By registerlink = By.linkText("Register");
	 By loginlink= By .linkText("Log in");
	 By serachbox= By.name("q");
	 By searchbutton=By.xpath("//input[@value='Search']");
	 By logoutbuttion=By.linkText("Log out");
	
	 // method/function
	 public void click_Register() {
		 driver.findElement(registerlink).click();
	 }
	 public void click_Login() {
		 driver.findElement(loginlink).click();
	 }
	 public void search_product(String product_name) {
		 driver.findElement(serachbox).sendKeys(product_name);
	 }
	 public void Search_button() {
		 driver.findElement(searchbutton).click();

	 }
	 
	 public void click_LogOut() {
		 driver.findElement(logoutbuttion).click();

	 }
	 
	 
	 
	 
	
	
	
	
	
	
	
	
}
