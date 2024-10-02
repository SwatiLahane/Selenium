package day58sep19ListnerConcept;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToAmazon extends ExcelSheet_MultipleData 
{
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{ 
		
	  
		ExcelSheet_MultipleData obj = new ExcelSheet_MultipleData();
	    obj.FetchValues();
	    
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("ap_email"));
		
		username.sendKeys(UN );
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
	    password.sendKeys(pwd); 
	    
	    WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
	    
	    signinButtn.click();
	
	    
	}
	
 }  

