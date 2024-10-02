package day_52_10Sep_Testng;

import org.testng.annotations.Test;


//Default invocation count is 1
//default priority of test case is 0 
//By default test case is enabled only

//First default priority zero will run then others according to priority if there

//inocationCount and priority together
public class TestNG1
{  
	
	 @Test(invocationCount = 10,priority =1)
	 
	 public void TestCase1()
	 {
		 System.out.println("1");
	 }
	 @Test(priority = 2)
	 public void TestCase2()
	 {
		 System.out.println("2");
	 }
	 @Test
	 public void TestCase3()
	 {
		 System.out.println("3");
	 }
	 
	 @Test(invocationCount = 2,priority = 3)
	 public void TestCase4()
	 {
		 System.out.println("4");
	 }
}
