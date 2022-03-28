package Amazon;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonNavigation {
	
	public static WebDriver driver;
	public WebElement ele;
	
		@BeforeSuite
		public void driversetup() 
		{
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		}	
		
		@BeforeMethod
		public void before() 
		{
			driver=new ChromeDriver();
			//driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
			driver.get("https://www.google.com/");	
			driver.manage().window().maximize();
		}
		
		@DataProvider(name="getdata")
		public Object[][] search(){
			return new Object[][]{{"amazon.ca"}};
		}
		
		@Test(dataProvider="getdata")
		public void Display(String Keywords) throws Exception 
		{	
			//keying Amazon.ca in the search box in Google
			driver.findElement(By.cssSelector(".gLFyf")).sendKeys("amazon.ca");
		    Thread.sleep(2000);
		    //Clicking the Search button
		    WebElement searchIcon = driver.findElement(By.name("q"));
		    searchIcon.submit(); 
		    
		    //After Search, clicking the Amazon.ca link
		    ele = driver.findElement(By.xpath
					("/html/body/div[7]/div/div[10]/div[1]/div[1]/div[3]/div/div[1]/div/div/div[1]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).click().build().perform();
			
			/* Taking Screen shot */
			//Convert web driver object to TakeScreenshot
		    TakesScreenshot scrShot =((TakesScreenshot)driver);
		    //Call getScreenshotAs method to create image file
		    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		    //Move image file to new destination
		    File DestFile=new File("C:\\Jamuna\\abc.png");
		    //Copy file at destination
		    FileUtils.copyFile(SrcFile, DestFile);
	
		    /* Checking Amazon Logo */
		    boolean result = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
			System.out.println("Checking the Logo "+result);
			Thread.sleep(1000);     
		    
			/*Amazon Mouse Over to Sign in */
			ele = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div"));
			Actions action1 = new Actions(driver);
			//Performing the mouse hover action on the target element. 
			action1.moveToElement(ele).perform();
			ele = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[1]/div/div/a"));
			Thread.sleep(2000);
			action1.moveToElement(ele).click().build().perform();
	       
			/* Creating POM object and filling the Signin form */
			ProjectPOM projectPOM = new ProjectPOM(driver);
			projectPOM.typeName("Jamuna");
			projectPOM.typeEmail("jamuna.satyanarayana81@gmail.com");
			projectPOM.typePassword("Chennai@2");
			projectPOM.typePasswordCheck("Chennai@2");
			
			/*Clicking the Continue */
		    ele = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input"));
			Thread.sleep(1000);
		    action1.moveToElement(ele).click().build().perform();
		    Thread.sleep(1000);
	    }

		@AfterMethod
		public void aftermethod() 
		{		
			  driver.close();	
		}	
}
