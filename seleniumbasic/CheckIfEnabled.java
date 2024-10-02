package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIfEnabled {

	public static void main(String[] args) 
	{
        
		ChromeDriver driver  = new ChromeDriver();//to launch empty browser
        
		driver.get("https://www.google.com"); //it launch google.com in browser 
		
		WebElement e1 = driver.findElement(By.name("q"));
		
		if(e1.isDisplayed() && e1.isEnabled()) //if both r true it will execute 
		{
			e1.sendKeys("India"+Keys.ENTER);
		}
		

	}

}
