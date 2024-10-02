package day_53_14sep_asseration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToAmazon 
{     
	 //Asseration using get title
     @Test
     public  void Login()
     {
    	 
     
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	 
	    driver.manage().window().maximize();
	    WebElement un = driver.findElement(By.id("ap_email"));
	
	    un.sendKeys("lahaneswati24@gmail.com");
	   
	    WebElement btn = driver.findElement(By.id("continue"));
	    btn.click();
	  
	   WebElement password = driver.findElement(By.id("ap_password"));
       password.sendKeys("swati_@lahane");  
     
       WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
    
       signinButtn.click();
      
      //1st way to x=check asseratrion 
      WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
      Assert.assertTrue(e1.isDisplayed());
      
      
      WebElement e2 = driver.findElement(By.id("twotabsearchtextbox"));
      Assert.assertTrue(e2.isDisplayed() && e2.isEnabled());
      
      
      //Second way to check asseration 		  
     
      //Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Sorry");
      
	
     }
	
}
