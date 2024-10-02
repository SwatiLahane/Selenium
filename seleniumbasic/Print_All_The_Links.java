package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_The_Links {

	public static void main(String[] args) 
	{
	   	   WebDriver driver  = new ChromeDriver();
	   	   
	   	   driver.get("https://www.firstcry.com/");
	   	   driver.manage().window().maximize();
	   	   
	   	   List<WebElement> l1 = driver.findElements(By.tagName("a"));

	   	   System.out.println(l1.size()); 
	   	   
	   	   for(int i=0; i < l1.size(); i++)
	   	   {
	   		 
	   		 WebElement LinkCount = l1.get(i);
	   		    
	   		 String url  = LinkCount.getAttribute("hfre");//to print all the urls 
	   		 System.out.println(url);
	   		 
	   		 
	   		 String text = LinkCount.getText();
	   		 System.out.println(text);
	   		 
	   		 
	   	   } 
	   	   
	 
	}

}
