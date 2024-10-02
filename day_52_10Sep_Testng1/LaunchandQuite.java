package day_52_10Sep_Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuite

{   
	WebDriver driver;
  
	@BeforeMethod
	public void launch()
	{
		  driver = new ChromeDriver();
 		  driver.get("https://www.amazon.in/");
 		
 		  driver.manage().window().maximize();
 		  WebElement un = driver.findElement(By.id("ap_email"));
 		
 		  un.sendKeys("lahaneswati24@gmail.com");
 		
 		  //Enter real login n password n then test 
 		
 		  
 		 WebElement password = driver.findElement(By.id("ap_password"));
         password.sendKeys("swati_@lahane"); 
 		  
 		 WebElement bttn = driver.findElement(By.id("ap_password"));
         bttn.click(); 
         
         WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
         
         signinButtn.click();
		
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	
	{   
		Thread.sleep(2000);
  		driver.quit();
	}
	  
	
}