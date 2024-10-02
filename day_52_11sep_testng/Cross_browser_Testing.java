package day_52_11sep_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser_Testing 
{
     WebDriver driver ;   
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser)
	{
		
		if(nameofbrowser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(nameofbrowser.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize(); //to maximize the browser
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoe" +Keys.ENTER);
		
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		
		e1.sendKeys("Shoe"+Keys.ENTER);

	
	}
	 
	
	
	
}
