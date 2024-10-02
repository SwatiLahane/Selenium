package day_51_09Sep_Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_Annotations {

	  
		@BeforeMethod
		public void bm()
		{
			System.out.println("BM");
		}
		@AfterMethod()
		public void AM()
		{
			System.out.println("AM");
		}
		@Test 
		public void Testcase1()
		{
			System.out.println("Test");
		}
		
		@Test
		public void Testcase2()
		{
			System.out.println("Test");
		}
		
  }
