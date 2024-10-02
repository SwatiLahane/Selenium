package day_52_10Sep_Testng1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestCase2 extends LaunchandQuite
{   
	WebDriver driver;
     
	@BeforeMethod
	public void logout()
	{
	    driver = new ChromeDriver();
	    WebElement e1 = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
	    
	    Actions a1 = new Actions(driver);
	    
	    a1.moveToElement(e1).perform();
	 
	    WebElement e2 = driver.findElement(By.xpath("//span[.='Sign Out']"));
	    
	    e2.click();
	    

	    
	 }
	
	@AfterMethod
	public void quit() throws InterruptedException
	
	{   
		Thread.sleep(2000);
  		driver.quit();
	}
	  
}
