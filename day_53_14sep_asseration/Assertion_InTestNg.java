package day_53_14sep_asseration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import graphql.Assert;

//How to pass the test case 
//How to fail test cases Detibretly
public class Assertion_InTestNg
{  
      
	@Test
	public void testcase() throws InterruptedException
	{
		 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes"+Keys.ENTER);
		
		Thread.sleep(2000);
		
		//click on 1st product n take class name n check how many times it come
		//n write  Xpath for all the shoes
		List<WebElement> e2 =driver.findElements(By.xpath("(//a[@class ='a-link-normal s-no-outline'])"));
	   
		Thread.sleep(2000);

		System.out.println(e1.getSize());
		
		Assert.assertTrue(e2.size() > 1);
		
		//Assert.assertTrue(true); //pass
		Assert.assertFalse(true);//reality and expectation both are diffrnt not matching expected n reality
		//so test case will be fail
		
		
	
	}
	  
} 
