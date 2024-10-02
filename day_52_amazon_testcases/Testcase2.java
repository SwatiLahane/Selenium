package day_52_amazon_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends LaunchandQuit
{
	@Test
	   public void login_searching()
	   {
		 
		     WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	       
		   e1.sendKeys("shoes"+Keys.ENTER);
		   
           WebElement e2 = driver.findElement(By.xpath("(//a[@class ='a-link-normal s-no-outline'])[1]"));
		   
		   e2.click();
		   
		//   (//a[@class ='a-link-normal s-no-outline'])[1]
	   
	   }

}
