package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationcommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		ChromeDriver driver =new ChromeDriver();	
		driver.get("https://www.google.com/");
	boolean result=	driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(result);
}
}