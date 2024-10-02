package day_51_09Sep_Testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_1 {

	    //Only @Test Decides number of testcasese , irespective of
	     @Test
		public void testcase1()
		{
			System.out.println("Test");
		}
		@BeforeSuite
		 public void login_to_amazon()
		{
			System.out.println("login to amazon");
		}
		

}
/* Order of Execution
 *   BeforeSuite   Loign to Amazon
 *   Test           Test   
 */
    
