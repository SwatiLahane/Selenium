package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickIsDisable {
    
	
	// //   Locate the element where right click is disable 
		//inside most of the banking application there is right click is not working to inspect
	public static void main(String[] args)
	
	{
		  
		  ChromeDriver driver = new ChromeDriver();
	       
	      driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	       
	      driver.manage().window().maximize();
		
		  WebElement e1 = driver.findElement(By.partialLinkText("CONTINUE"));
		  e1.click();
		  
		  WebElement e2 = driver.findElement(By.name("userName"));
		  e2.sendKeys("Swatilahane");
		  
		  WebElement e3 = driver.findElement(By.name("password"));
		  e3.sendKeys("Swati123@");
		  
		  WebElement e4 = driver.findElement(By.id("loginCaptchaValue"));
		  e4.sendKeys("Swati12");
		  
		  
		
	}

}
