package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Autosuggetion {
      
//	Launch amazon type shoe and select the 4th application
	
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");  
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		
		e.sendKeys("shoe");
		
		Thread.sleep(1000);
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		int count = li.size();
		System.out.println(count);
		
        li.get(count-9).click(); //count is 10 - 9 = 1 means second index start from zero
         
         
	}

}
