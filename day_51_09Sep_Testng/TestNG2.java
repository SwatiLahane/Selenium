package day_51_09Sep_Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2 
 {  
    @Test
    public void testcase1()
    {
    	System.out.println("Test");
    }
    
    @BeforeSuite
    public void BeforSuite()
    {
    	System.out.println("bs");
    }
    
    @BeforeTest
    public void BeforeTest()
    {
    	System.out.println("Before Test");
    }
    @BeforeClass
    
    	public void BeforeClass()
    	{
    		System.out.println("Before Class");
    	}
    
    @BeforeMethod
    public void BeforeMethod()
    {
    	System.out.println("Before Method");
    	
    }
	@AfterTest()
	public void Aftertest()
	{
		System.out.println("After Test");
	}
	@AfterClass
    
	public void AfterClass()
	{
		System.out.println("After Class");
	}

   @AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
		
	}
   @AfterSuite
   public void AfterSuite()
   {
	   System.out.println("After suite");
   }
	
 }  
 
