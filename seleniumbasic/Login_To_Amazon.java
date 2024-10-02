package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_Amazon {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("ap_email"));
		
		un.sendKeys("lahaneswati24@gmail.com");
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys("123Abc$"); 
        
        WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
        
        signinButtn.click();
        
        
	}

}
