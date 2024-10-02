package day57_18septDataFetchingExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestCase1
{
     
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
	    
		Workbook w1 = WorkbookFactory.create(f1);
	    
		String username = w1.getSheet("Login_Details").getRow(1).getCell(0).getStringCellValue();
		System.out.println(username);
		
	    
		String passwrd = w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();
	
	
	    System.out.println(passwrd );
	}
	
	
	
	
}
