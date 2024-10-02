package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	       
	       driver.get("https://www.google.com");
	       
	       driver.manage().window().maximize(); //to maximize the broowser
	       
	       WebElement E1= driver.findElement(By.partialLinkText("Sellers"));
	       E1.click();


	}

}
