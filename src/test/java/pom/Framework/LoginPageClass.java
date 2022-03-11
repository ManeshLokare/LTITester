package pom.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageClass {
	WebDriver driver;
	 public LoginPageClass(WebDriver driver) {
		 this.driver=driver;	
	}
	 //locator
	 @FindBy(name = "Email") public WebElement email;
	 @FindBy(name = "Password") public WebElement password;
	 @FindBy(name = "//input[@value='Log in']") public WebElement loginbutton;
	 
	 // method
	 public void login(String email_id,String userpassword) {
		 email.sendKeys(email_id);
		 password.sendKeys(userpassword);
		 loginbutton.click();
	 }

}
