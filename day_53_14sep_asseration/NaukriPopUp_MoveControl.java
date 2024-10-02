package day_53_14sep_asseration;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriPopUp_MoveControl 
{   
	//Popup base window 
	public static void main(String[] args)
	
	{
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement e1 = driver.findElement(By.xpath("//span[.='Google']"));
		
		e1.click(); //after click on google child window popup will come
	
	    
		Set<String> s1 = driver.getWindowHandles();
		
		System.out.println(s1); //It will give parent n child window id
		
	    driver.close();  //parent window get close which has control
	    
	    //here we use set thats why we use iterator
	    Iterator<String> ids =  s1.iterator();
	    
	    String Parentid  = ids.next();
	    String Childid = ids.next();
	    
	    driver.switchTo().window(Childid);
	    
	   driver.close();//After moving control parent to child now child window getclose
	
	}

}
