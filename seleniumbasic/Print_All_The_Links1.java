package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_The_Links1 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.com/");
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println(li.size());
		
		for(int i = 0; i < li.size(); i++)
		{
			
			WebElement e1 = li.get(i); // get method is having return type of webelement bcz we r getting single inedex at a time
			
			
			String url = e1.getAttribute("href");//get href 
			System.out.println(url); 
			
			String text = e1.getText(); //get text
			System.out.println(text);
			
		}
	
	
	
	
	}

} 
