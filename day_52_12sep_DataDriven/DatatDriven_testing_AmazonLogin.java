package day_52_12sep_DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


//login with two set of data
//WAP to login in amazon using 
//valid/invalid username and valid/invalid password usign @DataProvider annotation



public class DatatDriven_testing_AmazonLogin
{
	
  
	@Test(dataProvider = "data")
	public void method(String username , String password)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement Uname = driver.findElement(By.id("ap_email"));
		Uname.sendKeys(username);
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		//continue
		
		WebElement Pswrd = driver.findElement(By.id("ap_password"));
		Pswrd.sendKeys(password);
		
		WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
	       
	    signinButtn.click();
	       
			
     }
	@DataProvider(name = "data")
	public Object[][] data()
	{                          
		                  // 4 rows and 2 columns
		Object[][] d1 = new  Object[4][2];
		
	    d1[0][0] ="lahaneswati24@gmail.com"; //valid user  
		d1[0][1] ="swati_@lahane"; //valid passwrd
		
		d1[1][0] ="9146810272"; //valid mobile number  
		d1[1][1] ="swati_@lahane"; //valid passwrd
		
		d1[2][0] ="lahane@gmail.com"; //invalid  mobile number  
		d1[2][1] ="swati_@lahane"; //valid passwrd
		
		d1[3][0] ="7887654433"; //invalid mobile number  
		d1[3][1] ="swati_@lahane"; //valid passwrd
		
		return d1;
	}
	
	
	
}
