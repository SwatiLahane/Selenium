package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Facebook {
         
	
	//tagname[@AN='AN'] ==AN - Attributename and attribute value
	public static void main(String[] args)
	{
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement button = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		button.click();
		
		
		
		
		//here we use class because it is keep on changing ="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"
		
         //click on create new account new type of relative xpath 
		//a[@id='u_0_0_GK']
		
		
	}

}
