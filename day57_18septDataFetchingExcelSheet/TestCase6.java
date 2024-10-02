package day57_18septDataFetchingExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase6 
{
   //How to fetch numeric value from the excel sheet
// we have to use NumberToTextConvertor.toText(w1.getsheet)	
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{ 
		
	
	    FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
	    
		Workbook w1 = WorkbookFactory.create(f1);
	                                                             
		String username = w1.getSheet("Login_Details").getRow(2).getCell(0).getStringCellValue();
		System.out.println(username);
	     
		
	   String passwrd = w1.getSheet("Login_Details").getRow(2).getCell(1).getStringCellValue();
	 
       System.out.println(passwrd );
	   
	     
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("ap_email"));
		
		un.sendKeys(username );
		
		WebElement btn = driver.findElement(By.id("continue"));
		btn.click();
		
		WebElement password = driver.findElement(By.id("ap_password"));
	    password.sendKeys(passwrd); 
	    
	    WebElement signinButtn= driver.findElement(By.id("signInSubmit"));
	    
	    signinButtn.click();
	}
}
