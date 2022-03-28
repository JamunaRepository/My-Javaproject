package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPOM {
	WebDriver driver;
	
	
	@FindBy(id="text-77525447616")WebElement FName;
	@FindBy(id="text-95374915097")WebElement LName;
	
     public ContactusPOM(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void typeFname(String name) {
		FName.sendKeys(name);
	    LName.sendKeys(name);
	}
	
	
}


