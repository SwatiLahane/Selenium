package day_52_12sep_DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Using multidimentional array 
public class DataDrivenTesting
{
    @Test(dataProvider = "inputs")
     
    public void Method1(String input)
    {
       ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		
		WebElement Search = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		Search.sendKeys(input+Keys.ENTER);
		//Thread.sleep(4000);
		
		
    }	
    
		@DataProvider(name = "input")
		public Object[][] data1()
		{
			return new Object[][] {{"How to become president"},{"How to be spiritual"},{"Pune"},{"Banglore"}};
		   	
			
		}
  
}
