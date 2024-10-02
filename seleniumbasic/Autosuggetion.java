package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion {

	public static void main(String[] args) throws InterruptedException
	{
       
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.name("q"));
        
		e1.sendKeys("banglore");
		Thread.sleep(1000);
		List<WebElement> li= driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		
		System.out.println(li.size());
		
		li.get(1).click();
	   //	li.get(2).click();
		//li.get(3).click();
//		/li.get(9);
		
		
		
 
	}

}
