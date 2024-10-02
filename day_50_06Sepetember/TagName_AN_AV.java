package day_50_06Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName_AN_AV {

	public static void main(String[] args)
	{
	     //Tagname[AN = 'AV']
		  
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");https://www.facebook.com/
		driver.manage().window().maximize();
				
		WebElement e1 = driver.findElement(By.cssSelector("input[id='email']"));
		        
	    e1.sendKeys("Swati");
	
	
	
	}

}
