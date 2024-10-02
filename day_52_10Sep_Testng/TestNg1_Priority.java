package day_52_10Sep_Testng;

import org.testng.annotations.Test;


//Default invocation count is 1
//default priority of test case is 0 
//By default test case is enabled only
//WAP to disable a test case


public class TestNg1_Priority
{

	@Test(invocationCount = 10,priority = 2)
	public void Testcase1()
	{
		
		System.out.println("1");
		
	}
	@Test
	public void Testcase2()
	{
		
		System.out.println("2");
		
	}

	@Test
	public void Testcase3()
	{
		
		System.out.println("3");
		
	}
}
