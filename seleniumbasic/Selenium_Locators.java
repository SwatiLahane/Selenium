package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


//Launch google.com type India and click on search button

public class Selenium_Locators {

	public static void main(String[] args)
	{   
		
		ChromeDriver driver = new ChromeDriver();
		
		//For maximize Browser
		driver.manage().window().maximize();
		//TO minimize Brower
		//driver.manage().window().minimize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("input")).sendKeys("India");
		
		driver.findElement(By.id("input")).sendKeys(Keys.ENTER);
		
		//driver.findElement(By.name("btnK")).click();
		
		
		
		
       
		
	}

}
