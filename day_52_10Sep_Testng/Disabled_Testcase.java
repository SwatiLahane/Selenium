package day_52_10Sep_Testng;

import org.testng.annotations.Test;

//Default invocation count is 1
//default priority of test case is 0 
//By default test case is enabled only

//First default priority zero will run then others according to priority if there

public class Disabled_Testcase
{
   @Test
   public void testcase1()
   {
	   System.out.println("1");
   }
	
   @Test(enabled = false)
   public void testcase2()
   {
	   System.out.println("2");
   }
   
   @Test
   public void testcase3()
   {
	   System.out.println("3");
   }
   
   @Test(enabled = false)
   public void testcase4()
   {
	   System.out.println("4");
   }
}
