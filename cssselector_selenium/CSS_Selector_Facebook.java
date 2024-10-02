package cssselector_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Facebook {

	 
	//Goto Fb search Email using TN, AN and AV in CSS selector locator and then enter email. 

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		 
	    driver.get("https://www.facebook.com/");
	    
	   
	    WebElement username = driver.findElement(By.cssSelector("input[id^ ='email' ]"));
	 
	    username.sendKeys("lahaneswati24@gmail.com");
	    
	    WebElement password = driver.findElement(By.cssSelector("input[name^ = 'email']"));
		 
	    password.sendKeys("Swati_!@34");
		
	    //here we can write attribute name partially
	    
	    WebElement button = driver.findElement(By.cssSelector("button[class^='_42ft _4jy0']"));
		 
	  button.click();

      
	}

}
