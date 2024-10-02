package day57_18septDataFetchingExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase8
{   
	
	
	@Test()
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
	public Object[][] data() throws EncryptedDocumentException, IOException
	{      
		
		
		 FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
		    
	     Workbook w1 = WorkbookFactory.create(f1);
		                                                             
		 String username1 = w1.getSheet("Login_Details").getRow(2).getCell(0).getStringCellValue();
		

		 String passwrd1= w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();

			   
		 String username2 = w1.getSheet("Login_Details").getRow(2).getCell(0).getStringCellValue();
		 String passwrd2 = w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();

		
		
		                  // 4 rows and 2 columns
		Object[][] d1 = new  Object[4][2];
		
	    d1[0][0] =  username1; //valid user  
		d1[0][1] =  passwrd1; //valid passwrd
		
		d1[1][0] = username2 ; //valid mobile number  
		d1[1][1] =passwrd2; //valid passwrd
		
  /*	d1[2][0] ="lahane@gmail.com"; //invalid  mobile number  
		d1[2][1] ="swati_@lahane"; //valid passwrd
		
		d1[3][0] ="7887654433"; //invalid mobile number  
		d1[3][1] ="swati_@lahane"; //valid passwrd        */
 		
		return d1;
	}
	
   
	
	
	
	
	
}
