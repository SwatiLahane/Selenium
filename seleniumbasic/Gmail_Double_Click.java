package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail_Double_Click {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.id("Gmail"));
        
		Actions a1 = new Actions(driver);
		a1.contextClick(e1).perform();//contextClick.perform method help us to do right click
		
	}

}
