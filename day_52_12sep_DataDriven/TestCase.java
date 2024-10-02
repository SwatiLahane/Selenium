package day_52_12sep_DataDriven;

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
	
	                     //package name.class
    @Test(retryAnalyzer=day_52_12sep_DataDriven.class)
    public void login_to_amazon()
    {
    	
       
    	new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); //to maximize the browser
		
		
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe" +Keys.ENTER);
		
		//Purposefully failing by changing the id 
		//Even though i run it 100 times or 1000 times it will never pass
		//we have to check locators
		
		WebElement e1= driver.findElement(By.id("twotabsear"));
		
		e1.sendKeys("Shoe"+Keys.ENTER);
		
       //WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		
	  //	e1.sendKeys("Shoe"+Keys.ENTER);
    
    
    
    }
	
	
	
}
