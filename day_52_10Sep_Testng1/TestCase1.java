package day_52_10Sep_Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class TestCase1 extends LaunchandQuite
{ 
	@Test
	public void login_Searching()
	{
		
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	    e1.sendKeys("Shoes"+Keys.ENTER);
	    
	    WebElement e2 = driver.findElement(By.xpath("(//a[@class = 'a-link-normal s-no-outline'])[1]"));
	    e2.sendKeys("Shoes"+Keys.ENTER);
	    
	   e2.click();
	
	
	}
	  
	
}	
	