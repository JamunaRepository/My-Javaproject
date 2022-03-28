package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class first
{


	public static void main(String[] args) 
	{
		
		//Step 1 open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		//step 2 type url
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.roicians.com/contact-us/");
		driver.findElement(By.id("text-77525447616")).sendKeys("Jamuna");
		driver.findElement(By.id("text-95374915097")).sendKeys("");
		driver.findElement(By.id("text-27022866830")).sendKeys("jam_2812@yahoo.com");
		driver.findElement(By.id("field-tIgxvmTMez6ibt1")).sendKeys("4167205720");	
		driver.findElement(By.id("field-kJfKGbPLNi5yFI7")).sendKeys("Hello");
		driver.findElement(By.id("button-18782068913")).click();
				
		String Expected_message="Field value is required.";
		System.out.println("Expected Message: "+ Expected_message);

		String actual_message= driver.findElement(By.cssSelector("#parsley-id-7 >li")).getText();
		System.out.println("Actual Message: "+ actual_message);

		if(Expected_message.equals(actual_message)) 
		{
			System.out.println("test case passed");
		}
		else 
		{
		     System.out.println("test case failed");
		}
		
	}
	
}

	
    
    
    
    
    
			
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
