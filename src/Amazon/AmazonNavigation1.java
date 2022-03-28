package Amazon;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonNavigation1 
{
	public static WebDriver driver;
	public WebElement ele;
	
		@BeforeSuite
		public void driversetup() 
		{
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver=new ChromeDriver();
		}	
		
		@BeforeMethod
		public void before() 
		{
			//driver=new ChromeDriver();
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
			driver.get("https://www.google.com/");	
			driver.manage().window().maximize();
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
		}
		
		public void TakeScreenShot() throws Exception
		{
			/* Taking Screen shot */
			//Convert web driver object to TakeScreenshot
		    TakesScreenshot scrShot =((TakesScreenshot)driver);
		    //Call getScreenshotAs method to create image file
		    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		    //Move image file to new destination
		    File DestFile=new File("C:\\Jamuna\\abc.png");
		    //Copy file at destination
		    FileUtils.copyFile(SrcFile, DestFile);
		}
		
		    
	   

		@AfterMethod
		public void aftermethod() 
		{		
			  driver.close();
			
		}	
	
	 /* public static void main(String[] args) throws Exception
	  {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://www.google.com/");	
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.cssSelector(".gLFyf")).sendKeys("amazon.ca");
		  Thread.sleep(2000);
		  WebElement searchIcon = driver.findElement(By.name("q"));
		  searchIcon.submit();  

		  
		  WebElement webele = driver.findElement(By.xpath
				("/html/body/div[7]/div/div[10]/div[1]/div[1]/div[3]/div/div[1]/div/div/div[1]/a"));
		  Actions action = new Actions(driver);
		  action.moveToElement(webele).click().build().perform();
		  
		  //Convert web driver object to TakeScreenshot
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		  //Call getScreenshotAs method to create image file
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  //Move image file to new destination
		  File DestFile=new File("C:\\Jamuna\\abc.png");
		  //Copy file at destination
		  FileUtils.copyFile(SrcFile, DestFile);
		  
		  
		  WebElement ele = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div"));
          //Creating object of an Actions class
		  Actions action1 = new Actions(driver);
		  //Performing the mouse hover action on the target element. 
		  action1.moveToElement(ele).perform();
		  Thread.sleep(2000);
		  action1.moveToElement(ele).click().build().perform();
		
		  driver.findElement(By.id("ap_email")).sendKeys("tharanipathi2@gmail.com");
		  Thread.sleep(2000);
		  WebElement con = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input"));
          //Creating object of an Actions class
		  Actions actionClick = new Actions(driver);
		  actionClick.moveToElement(con).click().build().perform();
		  
		  driver.findElement(By.id("ap_password")).sendKeys("Chennai@1");
		  Thread.sleep(2000);
		  WebElement con1 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input"));
          //Creating object of an Actions class
		  Actions actionClick1 = new Actions(driver);
		  actionClick1.moveToElement(con1).click().build().perform();
		  
		  
		  WebElement signout = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span"));
          //Creating object of an Actions class
		  Actions action2 = new Actions(driver);
		  //Performing the mouse hover action on the target element. 
		  action2.moveToElement(signout).perform();
		  Thread.sleep(2000);
		  WebElement signout1 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[3]/div[3]/div[2]/div/div[2]/a[15]/span"));
          //Creating object of an Actions class
		  Actions action3 = new Actions(driver);
		  action3.moveToElement(signout1).click().build().perform();
		  Thread.sleep(2000);
		  driver.close();
		
		 	// driver.get("http://www.amazon.ca/");
		 //driver.manage().window().maximize();
		/[@id="nav-flyout-iss-anchor"]
		// /html/body/div[1]
		 //WebElement selectMenuOption = driver.findElement(By.id("a-page"));
		 //selectMenuOption.click();
	     //System.out.println("Selected from Menu"+selectMenuOption.toString());
		/[@id="glow-ingress-block"] 
	  }*/
}

