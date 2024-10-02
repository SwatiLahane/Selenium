package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
      
	
	//Launch Amazon click and  on best seller
	public static void main(String[] args) {
		
		
	       ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.google.com");
	       
	       driver.manage().window().maximize();
	       
	       WebElement E1= driver.findElement(By.linkText("Best Sellers"));
	       E1.click();

	}

}
