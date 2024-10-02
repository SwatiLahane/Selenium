package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_Xpath {
	
	 //Xpath using tag name 
	//(tagname[.= 'LTmsg'])
   //(//span[.='Mobile')][1] /[2]
	
	public static void main(String[] args) 
	
	{
		  
		    ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com/");
			
			WebElement button = driver.findElement(By.xpath("//span[.='Mobile')][1]"));
			
			button.click();
				

	}

}
