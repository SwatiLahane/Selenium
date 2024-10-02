package day_50_06Sep_Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg1
   {
      @Test
      public void test()
      
      {
    	  System.out.println("Test");
      }
	  @BeforeSuite
	  public void bs()
	  {
		  System.out.println("BS");
	  }
	  
	  @BeforeTest
	  public void bt()
	  {
		  System.out.println("BT");
	  }
	  @BeforeMethod
	  public void bm()
	  {
		  System.out.println("BM");
	  }
	  @AfterTest
	  public void at()
	  {
		  System.out.println("AT ");
	  }
	  @AfterMethod 
	  public void am()
	  {
		  System.out.println("AM");
	  }
	  @AfterSuite
	  public void as()
	  {
		  System.out.println("AS");
	  }
	}
	
