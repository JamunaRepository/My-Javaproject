package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPOM 
{
	WebDriver driver;
	
	 public ProjectPOM(WebDriver driver) 
	 {
			
			PageFactory.initElements(driver,this);
	 }
	 @FindBy (id="ap_customer_name")WebElement Name;
	 @FindBy (id="ap_email")WebElement Email;  
	 @FindBy (id="ap_password") WebElement Password ;
	 @FindBy (id="ap_password_check")WebElement PasswordCheck; 
	 
	 public void typeName(String name) 
	 {
			Name.sendKeys(name);
	 }
	 public void typeEmail(String email) 
	 {
			Email.sendKeys(email);
	 }
	 public void typePassword(String password) 
	 {
		 Password.sendKeys(password);
	 }
	 public void typePasswordCheck(String passwordCheck) 
	 {
		 PasswordCheck.sendKeys(passwordCheck);
	 }

}
