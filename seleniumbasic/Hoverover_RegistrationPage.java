package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_RegistrationPage
{
	
	    
		// https://grotechminds.com/automate-me/, hoverover Registration application
			
			public static void main(String args[]) 
			{
			         
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://grotechminds.com/automate-me");
				driver.manage().window().maximize();
				WebElement e1 = driver.findElement(By.xpath("(//div[@data-id = '3091cca'])[1] "));
			     
				Actions a1 = new Actions(driver);
				a1.moveToElement(e1).perform();
				
				WebElement e2 = driver.findElement(By.xpath("(//a[@target ='_blank'])[2]"));
				
				e2.click();
				
				driver.close();
				

			}

		}


