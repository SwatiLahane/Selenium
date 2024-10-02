package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Amazon {
    
	//Launch Amazon INdia and hoverover Account and list and click on sign in 
	public static void main(String[] args)
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		driver.manage().window().maximize();
		
		//Account & Lists see where is account n list then take class name from there
		WebElement e1 = driver.findElement(By.xpath("(//span[@class = 'nav-line-2 '])[1]"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		
		//xpath using text msg
		WebElement e2 = driver.findElement(By.xpath("//span[ .= 'Sign in'][1]"));
        e2.click();   
		

	}

}
