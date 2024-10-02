package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

//Second Way Without creating object of TakescreenShot 
public class Unique_Screen_Shot3 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");  
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("twotabsearchtextbox"));
		
		e.sendKeys("mobiles");
		Thread.sleep(1000);
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		
		int count = li.size();
		System.out.println(count);
		
		for(int i =0; i < count; i++)
		{
		   System.out.println(li.get(i).getText());
		}
		li.get(3).click();
		File Source = driver.getScreenshotAs(OutputType.FILE);
		
		File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\screenshot2.jpg");
      
		    FileHandler.copy(Source, Destination);
	}

}
