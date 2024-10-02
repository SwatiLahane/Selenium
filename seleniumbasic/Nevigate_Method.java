package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate_Method {

	
	 //How to go back how to move forward how to refress using navigate method
	public static void main(String[] args) throws InterruptedException
	{
		  ChromeDriver driver = new ChromeDriver(); //launch empty browser means neither forward n backward is enabled
		
	       
	     // driver.get("https://www.google.com");
	      
	      //Another way to launch url  
	      driver.navigate().to("https://www.google.com");
	      
	      driver.manage().window().maximize();
	      
	      driver.navigate().back();
	      Thread.sleep(2000);
          driver.navigate().forward();	      
          Thread.sleep(2000);
          driver.navigate().refresh();
          
	}

}
