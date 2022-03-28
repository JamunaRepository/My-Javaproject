package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testnew 
{
  
  //stlc write test cases,execution,logging defects
	
	
@BeforeSuite//only once system.setproperty
public void beforesuite() {
	System.out.println("Before Suite");
	
	
}
	@BeforeTest//webdriver driver=firefoxdriver(),implicit wait,pagetimeout,
	public void beforetest() {
		System.out.println("before test");
		}
	
	@BeforeClass//login details
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod//url
	public void beforemethod() {
		System.out.println("before method");
	}
	
	
	@Test(priority=1)
	
	public void writetestcases() 
	{
		System.out.println("First write test cases");
	}
	
	
	@Test(priority=2)
	public void Executetestcase() 
	{
		System.out.println("Then execute test cases");
	}
	
	@Test(priority=3)
	public void Defect() 
	{
		System.out.println("Log defect");
	}
	
	@AfterMethod//close browser
	public void aftermethod() {
		System.out.println("after method");
	}	
	
	@AfterClass//executed only once after all test cases are executed.logout can be performed
	public void afterclass() {
		System.out.println("after class");
	}	
	
	
	@AfterTest//this will also executed only once but after class condition
	
	public void aftertest() {
		System.out.println("after test");
	}
	@AfterSuite//atlast.when allther annotations have been executed according to sequence 
	public void aftersuite() {
		System.out.println("after suite");
	}
	
	}
	
	
	
	





