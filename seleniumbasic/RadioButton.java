package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args)
	{
		 ChromeDriver driver = new ChromeDriver();
    	 
		 driver.get("https://grotechminds.com/registration/");
    	 driver.manage().window().maximize();
    	 
    	// WebElement Male = driver.findElement(By.id("male"));
    	 
    	// Male.click();
    	 
    	 WebElement Female = driver.findElement(By.id("Female"));
    	 Female.click();
    	 
    	 
	}

}
