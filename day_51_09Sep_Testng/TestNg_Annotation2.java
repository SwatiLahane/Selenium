package day_51_09Sep_Testng;

import org.testng.annotations.Test;

public class TestNg_Annotation2
{
	//It will run in alphabetical order if there is two @Test 
	
    
	   @Test
	   public void login()
	   {
		 System.out.println("login");
	   }
	    
	   @Test
	   public void registration()
	   {
		   System.out.println("Registration");
	   }
	   @Test
	   public void logout()
	   {
		 System.out.println("logout");
	   }
}
