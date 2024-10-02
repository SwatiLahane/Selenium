package day_52_amazon_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Login to amazon -> searching for product ->and logout
public class LaunchandQuit 
{   
	ChromeDriver driver;
	
   @BeforeMethod
   public void launch()
   {
		      new ChromeDriver();
			  driver.get("https://www.amazon.in/");
			
			  driver.manage().window().maximize();
			  WebElement un = driver.findElement(By.id("ap_email"));
			
			  un.sendKeys("lahaneswati24@gmail.com");
			
			  //Enter real login n password n then test 
			  
			  WebElement password = driver.findElement(By.id("ap_password"));
	          password.sendKeys("123Abc$"); 
	       
	          WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
	       
	          signinButtn.click();
	       
   }
   
   @AfterMethod
   public void quit() throws InterruptedException
   {    
	   
	 //Logout to amazon
   	
   	//See where is Account n listas take class name from there
 	     WebElement w1 = driver.findElement(By.xpath("(//span[@class ='nav-line-2'])[1]"));
 	     
 	     Actions s2 = new Actions(driver); 
 	     s2.moveToElement(w1).perform();
 	     
 	     WebElement w2 = driver.findElement(By.xpath("//span[.='Sign Out']"));
         w2.click();
 	  
   	  
	     Thread.sleep(2000);
	     driver.quit();
 
   }
}
