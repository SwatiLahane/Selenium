package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goole_Arrow_Down_Button {
	
	//use Arrow down button to press 5th option in serach text field
	

	public static void main(String[] args) throws InterruptedException
	{
	
         ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		WebElement Search = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		Search.sendKeys("India");
		Thread.sleep(4000);
		
		Search.sendKeys(Keys.ARROW_DOWN);
		Search.sendKeys(Keys.ARROW_DOWN);
		Search.sendKeys(Keys.ARROW_DOWN);
		Search.sendKeys(Keys.ARROW_DOWN);
		Search.sendKeys(Keys.ARROW_DOWN);
		
		Search.sendKeys(Keys.ENTER);
		
		
	}

}
