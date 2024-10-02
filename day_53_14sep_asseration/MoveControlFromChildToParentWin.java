package day_53_14sep_asseration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveControlFromChildToParentWin 
{
  
	
	 //Reletive xpath
		public static void main(String[] args) throws InterruptedException
		{
		    
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("Girls Bag"+Keys.ENTER);
			
			WebElement e2 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
			e2.click();
			
		//	WebElement e3 = driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']"));
	   //	e3.click();
			
            
			 Set<String>  s1 = driver.getWindowHandles();
			 System.out.println(s1);
			 
			 Iterator<String> i1 = s1.iterator();
			 
			 String Parentid = i1.next();
			 String Childid =  i1.next();
			 
			 System.out.println(Parentid); //It will Print Parent Id
			 System.out.println(Childid); //It will Print child Id
			 
			 driver.switchTo().window(Childid);  
			 
			 WebElement e3 = driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']"));
			 e3.click();
					
			 
			 Thread.sleep(2000);
			 driver.close(); //it will close the window which has control
		   	 
		
		}

}
