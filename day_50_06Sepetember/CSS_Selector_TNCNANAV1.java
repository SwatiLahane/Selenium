package day_50_06Sepetember;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_TNCNANAV1 {
 
	
	//Tagname.Classname[AN = 'AV']
	public static void main(String[] args) 
	{
	    
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.cssSelector("textarea.gLFyf[name='q']"));
		e1.sendKeys("Pune"+Keys.ENTER);
	}

}
