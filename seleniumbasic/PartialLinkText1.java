package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText1 {

	public static void main(String[] args) 
	{
              
		   ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	       
	       driver.manage().window().maximize(); //to maximize the broowser
	       
	       WebElement E1= driver.findElement(By.partialLinkText("CONTINUE"));
	       E1.click();

	      WebElement E2 = driver.findElement(By.name("username"));
		  E2.sendKeys("Swatilahane");
		  
		  WebElement E3 = driver.findElement(By.name("password"));
		  E3.sendKeys("absdh12");
		  
		  
		  WebElement E4 = driver.findElement(By.id("loginCaptchaValue"));
		  E4.sendKeys("rjugf46767");
 
	}

}
