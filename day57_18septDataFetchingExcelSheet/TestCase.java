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

public class TestCase 
{   
	
	
	 //C:\Users\Lenovo\Desktop\Java\SeleniumProject\DataFetching
	
	@Test
	public void searching() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
	    Workbook w1 = WorkbookFactory.create(f1);
	   
	    Sheet s1 = w1.getSheet("Login_Details");
	    Row r1 = s1.getRow(1); //row index
	    Cell c1  = r1.getCell(0); //column index  
	    
	    String Username = c1.getStringCellValue();
	     System.out.println(Username);
	    
	     
	}

}
