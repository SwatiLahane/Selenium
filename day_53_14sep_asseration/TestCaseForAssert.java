package day_53_14sep_asseration;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseForAssert
{
   @Test
   public void testcase()
   {
	   Assert.assertEquals(2, 2); //both are same test case will pass
      
	   Assert.assertEquals(false, true,"Sorry"); //test case will pass 
	   
	   Assert.assertEquals("Swati","Saavi","Sorry");
	   
	      
   
   }
}
