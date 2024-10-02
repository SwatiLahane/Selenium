package cssselector_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Id 
{

	//How to write CSS Selector in case of ID #id
		public static void main(String[] args) 
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.firstcry.com/");
			driver.manage().window().maximize(); //to maximize the browser
			
			driver.findElement(By.cssSelector("#search_box"));

		}
	}


