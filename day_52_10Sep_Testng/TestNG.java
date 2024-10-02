package day_52_10Sep_Testng;

import org.testng.annotations.Test;

public class TestNG 
{
      @Test(invocationCount = 10) //it will run 10 times
      public void testcase1()
      {
    	  System.out.println("1");
      }
	  @Test(enabled = false)   //to disable particular test case 
      public void testcase2()
      {
		  System.out.println("2");
      }

}
