package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_TheLinks {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println(li.size());
		
		for(int i = 0; i < li.size(); i++)
		{
			WebElement e1 = li.get(i);
			
			String url = e1.getAttribute("href");
			System.out.println(url); 
			
			String text = e1.getText();
			System.out.println(text);
			
		}
		
		 
		
	}

}
