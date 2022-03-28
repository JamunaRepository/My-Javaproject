package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertbutton")).click();
		Alert al= driver.switchTo().alert();
		al.accept();
		Thread.sleep(5000);//hard wait
		

}}
