package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class BrokenLinks {

	public static void main(String[] args) 
	{
        
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size()); //get the size of all the links
		
		for(int i = 0; i < l1.size(); i++) 
		{
			
			WebElement e1 = l1.get(i);  //get index of perticular link 
			String url = e1.getAttribute("href");//here we get every href url(get value of href))
			
			
			System.out.println(url);
			
			
		    
		
		}
		
 
	}

}
