package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion1 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.name("q"));
        
		e1.sendKeys("banglore");
		Thread.sleep(1000);
		List<WebElement> li= driver.findElements(By.xpath("//div[@class = 'OBMEnb']/ul/li"));
		
		int count = li.size();
		
		li.get(count-10).click();
		//;'li.get(count-6).click();
		
		
	}

}
