package pom.Framework;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	// Locators
	By male= By.id("gender-male");
	By female= By.id("gender-female");
	By firstname=By.name("FirstName");
	By lastname=By.name("LastName");
	By email=By.name("Email");
	By password=By.name("Password");
	By conformpassword=By.name("ConfirmPassword");
	By register=By.name("register-button");
	
	// Register function/methods
	public void register_male(String first_name,String last_name,String email_id,String user_password,String user_confirmpassword) 
	{
		driver.findElement(male).click();
		driver.findElement(firstname).sendKeys(first_name);
		driver.findElement(lastname).sendKeys(last_name);
		driver.findElement(email).sendKeys(email_id);
		driver.findElement(password).sendKeys(user_password);
		driver.findElement(conformpassword).sendKeys(user_confirmpassword);
		driver.findElement(register).click();
			
	}
	public void register_female(String first_name,String last_name,String email_id,String user_password,String user_confirmpassword) 
	{
		driver.findElement(female).click();
		driver.findElement(firstname).sendKeys(first_name);
		driver.findElement(lastname).sendKeys(last_name);
		driver.findElement(email).sendKeys(email_id);
		driver.findElement(password).sendKeys(user_password);
		driver.findElement(conformpassword).sendKeys(user_confirmpassword);
		driver.findElement(register).click();
			
	}
	
	
	
	
	
	
	
}
