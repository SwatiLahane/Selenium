package day57_18septDataFetchingExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase5 
{
	 //What will happen if we fetch the value from an empty set 
	//We will get Exception :java.lang.NullPointerException
	//We get NullPointerException when we try to fetch the value from empty cell
	@Test
	public void Login() throws EncryptedDocumentException, IOException
	{ 
		
	
	    FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
	    
		Workbook w1 = WorkbookFactory.create(f1);
	                                                              //cell is empty
		String username = w1.getSheet("Login_Details").getRow(1).getCell(10).getStringCellValue();
		System.out.println(username);
		
	    
		String passwrd = w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();
	
	
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
