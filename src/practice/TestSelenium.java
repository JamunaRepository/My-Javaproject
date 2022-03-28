package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSelenium {
  WebDriver driver;
  SoftAssert obj;
  
  
	@BeforeSuite
	public void driversetup() {
	  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	}
	
	
	@BeforeMethod
	public void before() {
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");		 
	}
	
	@DataProvider(name="getdata")
	public Object[][] search(){
		return new Object[][]{{"roicians"}};
	}
	
	@Test(dataProvider="getdata")
	public void Display(String Keywords) throws InterruptedException {
		
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys(Keywords);
		Thread.sleep(2000);
		}
		
	@AfterMethod
	public void aftermethod() {
		driver.close();
	}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

