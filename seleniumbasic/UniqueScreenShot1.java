package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UniqueScreenShot1 {

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
		
        li.get(count-9).click(); //count is 10 - 9 = 1 means second index start from zero
        //
        
        //Code for taking screen shot 
        
       
         //to take the uniquescreen shot add below line
         //+Math.random()+".png")
         
        // File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\Ram.png"+Math.random()+".png");
         
         
         //Another way to take unique screnn shot 
        // File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\Ram.png"+new UniqueScreenshot().getClass()+".png");

         //By using current Time
         
         Date d1 = new Date();
         d1.getTime();
         Date d2 = new Date(d1.getTime());
         String time = d2.toString();
         String date = time.substring(8,10);
         String month = time.substring(4,7);
         String year = time.substring(time.length()-4);
         String exactTime = time.substring(11,19);
         String currentTime = exactTime.replace(":", "-");
         String dateformate1 = date.concat(month).concat(year).concat(currentTime);
         
         
         
         TakesScreenshot t1 = driver;
         
         File Source  = t1.getScreenshotAs(OutputType.FILE);
         File Destination = new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\Ram.png"+currentTime+".png");

         FileHandler.copy(Source, Destination);
 
	}

}
