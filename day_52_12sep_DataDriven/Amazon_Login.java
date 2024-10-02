package day_52_12sep_DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Data Driven tetsing with two dimentional array no of rows n password
public class Amazon_Login
{
   @Test(dataProvider = "data1")
   public void loingtoamazon(String unsername, String pswd)
   {
	   //Login to amazon program
	   
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("ap_email"));
		
		un.sendKeys(unsername);
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
        password.sendKeys(pswd); 
       
       WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
       
       signinButtn.click();
       
	   
   }
   
   
   @DataProvider(name = "data1")
   
   public Object[][] method1()  //object class of two dimentional return type
   {
	                          //4 row n 2 column          
	   Object[][]  d1 = new Object[4][2];
	   
	   
	   
	   //1st row 
	   d1[0][0]= "9146810272"; //valid mobile no
	   d1[0][1]= "swati_@lahane";  //valid password
	   
	   
	 //2nd row
	  d1[1][0] = "lahaneswati24@gmail.com"; //valid email id
	  d1[1][1] = "swati_@lahane"; //valid password for email id
	  
	  //2nd row
	  d1[2][0] = "8934422112"; //invalid mobilenumber
	  d1[2][1] = "swati_@123"; //valid password for email id
       
	  //4nd row
	  d1[3][0] = "lahaneswati@gmail.com"; //invalid email id
	  d1[3][1] = "swati_@123"; //valid password for email id
 
	  
	  return d1;
			   
		
			   
	   
   }
   
   
}
