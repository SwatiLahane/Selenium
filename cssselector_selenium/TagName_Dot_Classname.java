package cssselector_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_Dot_Classname {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.firstcry.com/");
        driver.manage().window().maximize();
        
        WebElement e1 = driver.findElement(By.cssSelector("input.input-text L14_9e"));
        
        e1.sendKeys("Girls Dresses"+Keys.ENTER);
        
	}

}
