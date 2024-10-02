package day_52_10Sep_Testng1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Different_WaysToLaunchBrowser 
    {
	    WebDriver driver;
	    
	      @Test
	      public void Method1()
	      
	      {    
	    	   Scanner s1 = new Scanner(System.in);
	    	   System.out.println("Type 1 for Launching chrome browser");
	    	   System.out.println("Type 2 for Launching Firefox");
	    	   System.out.println("Type 3 for Launching Edge");
	    	   
	    	   int input = s1.nextInt();
	    	   
	    	   if(input == 1)
	    	   {
	    		   new ChromeDriver();
	    	   }
	    	   
	    	   if(input == 2)
	    	   {
	    		   new FirefoxDriver();
	    	   }
	    	   if(input == 3)
	    	   {
	    		   new EdgeDriver();
	    	   }
	    	   
	      }
	      
	      

	}


