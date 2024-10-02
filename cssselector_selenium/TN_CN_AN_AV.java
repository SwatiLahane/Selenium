package cssselector_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TN_CN_AN_AV {

	public static void main(String[] args) 
		
		  {
			
		     WebDriver driver = new ChromeDriver();
		 	 
			 driver.get("https://www.Google.com");
			 
			 WebElement e1 = driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
			 
			 e1.sendKeys("Bangalore"+Keys.ENTER);
			 
			
		      
			}

	}


