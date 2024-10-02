package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) 
	{
	
          ChromeDriver driver = new ChromeDriver();
          
          driver.get("file:///C:/Users/Lenovo/Desktop/learningHTML1.html");
          
          WebElement tagname = driver.findElement(By.tagName("a"));
          tagname.click();
          
	}

}
