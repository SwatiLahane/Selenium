package day_52_amazon_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends LaunchandQuit
 {
     
	   @Test
	   public void login_searching()
	   {
		   WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
	       
		   e1.sendKeys("shoes"+Keys.ENTER);
	   
		  
	   }
 }
