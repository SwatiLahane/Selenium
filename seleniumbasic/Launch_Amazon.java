package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Amazon {

	public static void main(String[] args)
	{
	   
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); //to maximize the browser
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe" +Keys.ENTER);
		
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		
		e1.sendKeys("Shoe"+Keys.ENTER);

	}

}
