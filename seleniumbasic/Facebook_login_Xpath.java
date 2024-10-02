package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_Xpath {
       
	
	//Relative xpath
	public static void main(String[] args) 
	{
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement uesername = driver.findElement(By.xpath("((//input)[3])"));
		uesername.sendKeys("Swati123@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input)[4]"));
		password.sendKeys("swati1233");
		
		WebElement Login = driver.findElement(By.xpath("//button"));
		Login.click();
		

	}

}
