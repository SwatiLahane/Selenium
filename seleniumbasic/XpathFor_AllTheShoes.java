package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFor_AllTheShoes 
{
       
	public static void main(String arg[])
	{
	
	 
	  ChromeDriver driver = new ChromeDriver();
	
   	  driver.get("https://www.amazon.in/");
	
	  WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	  e1.sendKeys("shoe"+Keys.ENTER);
	
  
	
     //x path for all the shoes
	 List<WebElement> e2 =driver.findElements(By.xpath("(//a[@class ='a-link-normal s-no-outline'])"));
     
	 System.out.println(e1.getSize());

	} 

}