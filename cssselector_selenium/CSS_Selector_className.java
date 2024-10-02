package cssselector_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_className {
    
	//How to write css selector by using .classname_value
	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		 
	    driver.get("https://www.Googel.com");
	 
	    WebElement e1 = driver.findElement(By.cssSelector(".gLFyf"));
	 
	    e1.sendKeys("India"+Keys.ENTER);	
	
	}

}
