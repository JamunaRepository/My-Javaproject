package Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver;
	
	
@BeforeMethod
public void openbrowser() {
	Object chromedriver;
	System.setProperty("WebDriver.Chrome.driver","chromedriver.exe");
			
	driver=new ChromeDriver();
	driver.get("https://www.roicians.com/contact-us/");
		ContactusPOM abc = new ContactusPOM(driver);	
		
			
}
@Test
public void typeFName_validate() {
	
}



}

