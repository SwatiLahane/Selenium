package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_Search {

	public static void main(String[] args)
	{
	       
		   WebDriver driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
	   
	       driver.get("https://www.google.com/");
	       WebElement e1 = driver.findElement(By.name("q"));
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
           e1.sendKeys("Pune"+Keys.ENTER); 
           
           
           
           
           
     }

}
