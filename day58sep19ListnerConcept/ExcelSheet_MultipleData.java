package day58sep19ListnerConcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class ExcelSheet_MultipleData 
{
	static String UN ;
	static String pwd;
	public void FetchValues() throws EncryptedDocumentException, IOException
	{

	    FileInputStream f1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java\\SeleniumProject\\DataFetching\\SwatiSheet.xlsx");
	    
		Workbook w1 = WorkbookFactory.create(f1);
	                  
		
		for(int i =1, k =1; i < 7; i++, k++)
		{
			UN = w1.getSheet("Login_Details").getRow(1).getCell(0).getStringCellValue();
			pwd = w1.getSheet("Login_Details").getRow(1).getCell(1).getStringCellValue();
		
			System.out.println(UN);
			
		    System.out.println(pwd);
	   
	    }
	}
	}
