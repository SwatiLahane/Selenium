package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration_Form {

	public static void main(String[] args)
	{
		 
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://grotechminds.com/registeration-form");
		
		driver.manage().window().maximize(); 
		
		WebElement firstname = driver.findElement(By.name("firstName"));
		
		firstname.sendKeys("swati");
		
		WebElement lastname = driver.findElement(By.name("lastName"));
		
		WebElement Emailid = driver.findElement(By.id("email"));
		Emailid.sendKeys("lahaneswati10@gmail.com");
		
		
		WebElement Number = driver.findElement(By.id("phone"));
		Number.sendKeys("9123345567");
		
		WebElement e5 = driver.findElement(By.name("aadhaar"));
		e5.sendKeys("987654456717");
		
		
		WebElement e6 = driver.findElement(By.id("pan"));
		e6.sendKeys("A123444444444");
		
		
		WebElement e7 = driver.findElement(By.id("terms"));
		e7.click();
		
			
		
		WebElement e8 = driver.findElement(By.name("Submit"));
		e8.click();
	
		driver.close();
	
	
	
	}

}
