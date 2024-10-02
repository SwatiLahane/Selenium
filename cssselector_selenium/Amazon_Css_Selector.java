package cssselector_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Css_Selector {

	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); //to maximize the browser
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe" +Keys.ENTER);
		
		WebElement e1= driver.findElement(By.cssSelector("[id^ = 'twotab']"));
		
		e1.sendKeys("Shoe"+Keys.ENTER);
 
	}

}
