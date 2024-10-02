package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_SignIn_HoverOver {

	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
   	     driver.get("https://www.amazon.in/s?k=Girls+Bag&crid=2ZBWVJMQIIMB4&sprefix=girls+bag%2Caps%2C911&ref=nb_sb_noss_2");
   	  
   	   //See where is Account n listas take class name from there
   	    WebElement w1 = driver.findElement(By.xpath("(//span[@class = 'nav-line-2'])[1]"));
         
         //to overover on Hello Sign in
    	  
         Actions a1 = new Actions(driver);
         
          a1.moveToElement(w1).perform();
         
        		  
          WebElement w2 = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
          w2.click();
         
          WebElement un = driver.findElement(By.id("ap_email"));
     	
 	      un.sendKeys("lahaneswati24@gmail.com");
 	   
 	      WebElement btn = driver.findElement(By.id("continue"));
 	      btn.click();
 	  
 	     WebElement password = driver.findElement(By.id("ap_password"));
         password.sendKeys("swati_@lahane");  
      
         WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
     
         signinButtn.click();
         
        
   
   
   }
   
			

	}
