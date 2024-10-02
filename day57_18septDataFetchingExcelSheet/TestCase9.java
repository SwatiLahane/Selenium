package day57_18septDataFetchingExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase9 
{
        
	
	 @Test(dataProvider = "data1")
     public void Method1(int input)
     {
   	 System.out.println(input);  
     }

     @DataProvider(name="data1")
     public Object[][]  datainput() throws EncryptedDocumentException, IOException
     {
		
		
		 FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
		    
	     Workbook w1 = WorkbookFactory.create(f1);
		                                                             
		 String v1 = w1.getSheet("Login_Details").getRow(0).getCell(0).getStringCellValue();
		 String v2 = w1.getSheet("Login_Details").getRow(1).getCell(0).getStringCellValue();
		 String v3 = w1.getSheet("Login_Details").getRow(2).getCell(0).getStringCellValue();
         String v4= w1.getSheet("Login_Details").getRow(3).getCell(0).getStringCellValue();
         
         
		
         
         return new Object[][]  {{v1}, {v2}, {3},{4}};

			   
   	   
     }
	
	
	
}
