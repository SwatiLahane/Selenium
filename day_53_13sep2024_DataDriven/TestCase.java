package day_53_13sep2024_DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//For Retrie logic 
public class TestCase 
{
	
	WebDriver driver;
	
	
    @Test
    public void login_to_amazon()
    {
    	
       
    	new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); //to maximize the browser
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe" +Keys.ENTER);
		
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		
		e1.sendKeys("Shoe"+Keys.ENTER);
    
    
    
    }
	
	
	
}
