package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Dropdown {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));

		Select s1 = new Select(e1);
		//s1.selectByVisibleText("Books");
		
		s1.selectByValue("search-alias=stripbooks");
		
		s1.selectByIndex(10);
		
	}

}
