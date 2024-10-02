package day_50_06Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

	 //TN[AN^ = 'AV']
	
	public static void main(String[] args)
	{
	   
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.cssSelector("[id^ ='twotab']"));
	
	    e1.sendKeys("Kurties"+Keys.ENTER);
	
	}

}
