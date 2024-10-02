package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
      
    //How to handle dropdown 
public class Select_Drop_Down {

	public static void main(String[] args) 
	{
		
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
        
		Select s1 = new Select(e1);
	//	s1.selectByVisibleText("Books");
    //		s1.selectByValue("search-alias=stripbooks-intl-ship");
		s1.selectByIndex(5);
		
	}

}

