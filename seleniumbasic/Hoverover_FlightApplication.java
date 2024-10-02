package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//On  https://grotechminds.com/automate-me/, hoverover flight application and click on Read more


public class Hoverover_FlightApplication {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("");
		
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("(//h3[@class='elementor-flip-box__layer__title'])[3]"));
		
		Actions a1 = new Actions(driver);
		
		a1.moveToElement(e1).perform();
		Thread.sleep(3000);
		
		
		WebElement e2 = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        e2.click();  
      
        driver.close();

	}

}
