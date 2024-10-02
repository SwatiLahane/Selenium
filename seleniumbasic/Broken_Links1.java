package seleniumbasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links1 {

	public static void main(String[] args) throws IOException
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		
		System.out.println(l1.size());
		
		for(int i = 0; i < l1.size(); i++)
		{
			WebElement e1 = l1.get(i);
			String url = e1.getAttribute("href");//here we get every href url(get value of href))
			
			
			System.out.println(url);
			verify_the_link(url);
		    
		
		}
		
	}	
		static void verify_the_link(String url) throws IOException
		{
			  URL u1 = new URL(url);
			  HttpURLConnection u2 = (HttpURLConnection) u1.openConnection();
			  
			  if(u2.getResponseCode() == 200)
			  {
				  System.out.println("Valid Link "+u2.getResponseMessage() + " "+u2.getResponseCode());
				  
			  }
			  else
			  {
				  System.out.println("Its Invalid Link");
			  }
			
		}
			

}
