package seleniumbasic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_OnGmail {
      
	
	 // Launch Google and Right Click on Gmail
	
	public static void main(String[] args) throws AWTException
	{
		
		//ChromeDriver driver = new ChromeDriver();
		//another way of creating object of chrome driver
		
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.linkText("Gmail"));
		
		Actions a1 = new Actions(driver);
		
		a1.doubleClick(e1).perform();

		
		
		
	}

}
