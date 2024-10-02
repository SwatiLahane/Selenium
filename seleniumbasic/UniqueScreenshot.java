package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UniqueScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
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
		
        li.get(count-9).click(); //count is 10 - 9 = 1 means second index start from zero
        //
        
        //Code for taking screen shot 
        
        TakesScreenshot t1 = driver;
        
         File Source  = t1.getScreenshotAs(OutputType.FILE);
         //to take the uniquescreen shot add below line
         //+Math.random()+".png")
         
        // File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\Ram.png"+Math.random()+".png");
         
         
         //Another way to take unique screnn shot 
         File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\Ram.png"+new UniqueScreenshot().getClass()+".png");


         FileHandler.copy(Source, Destination);
         
		
		

	}

}
