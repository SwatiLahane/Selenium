package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsSelected {

	public static void main(String[] args) 
	{
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://grotechminds.com/registeration-form");
        
        WebElement e1 =driver.findElement(By.id("firstName"));
		e1.sendKeys("swati");
		
		WebElement e2 = driver.findElement(By.name("lastName"));
		e2.sendKeys("lahane");
		
		WebElement e3 = driver.findElement(By.id("email"));
		e2.sendKeys("lahaneswati10@gmail.com");
		
		WebElement e4 = driver.findElement(By.id("phone"));
		e2.sendKeys("9123334242");
		
		WebElement e5 = driver.findElement(By.name("aadhaar"));
		e2.sendKeys("987654456717");
		
		
		WebElement e6 = driver.findElement(By.id("pan"));
		e2.sendKeys("A123444444444");
		
		WebElement e7 = driver.findElement(By.id("terms"));
		if(e7.isSelected())
		{
			System.out.println("Check box is selected");
		}
		else
		{
			System.out.println("Check box is not selected so lets select it");
			e7.click();
		}
			
		
		WebElement e8 = driver.findElement(By.name("Submit"));
		e8.click();
	
		
	}

}
