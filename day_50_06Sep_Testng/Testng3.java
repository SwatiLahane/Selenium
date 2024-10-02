package day_50_06Sep_Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng3 
{
	@Test
    public void test()
    {
   	 System.out.println("Test");
    }
    
    @BeforeSuite
    public void BS()
    {
   	 System.out.println("BS");
    }
    @BeforeTest
    public void BT()
    {
   	 System.out.println("BT");
    }
    @BeforeClass
    public void BC()
    {
   	 System.out.println("BC");
    }
    @BeforeMethod
    public void BM()
    {
   	 System.out.println("BM");
    }
}