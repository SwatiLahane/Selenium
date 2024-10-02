package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_grotechminds {

	public static void main(String[] args) 
	{
		
		
		 ChromeDriver driver = new ChromeDriver();
    	 driver.get("https://grotechminds.com/registration/");
    	 driver.manage().window().maximize();
    	 WebElement fname = driver.findElement(By.id("fname"));
    	 fname.sendKeys("Swati");
    	 
    	 WebElement lname = driver.findElement(By.id("lname"));
    	 lname.sendKeys("Lahane");
    	 
    	 WebElement email1 = driver.findElement(By.id("email"));
    	 email1.sendKeys("lahaneswati24@gmail.com");
    	 
    	 WebElement password = driver.findElement(By.id("password"));
    	 password.sendKeys("Swati@24");
    	 
    	 //Radio Button
    	 WebElement gender = driver.findElement(By.id("Female"));
    	 gender.click();
    	 
    	 //Dropdown
    	 WebElement e1 = driver.findElement(By.name("Skills"));  
    	 Select s1 = new Select(e1);
    	 s1.selectByVisibleText("Technical Skills");
    	 
    	 WebElement e2 = driver.findElement(By.id("Country"));
    	 
    	 Select s2 = new Select(e2);
    	 s2.selectByValue("India");
    	 
    	 
    	 WebElement CAddress = driver.findElement(By.name("Present-Address"));
    	 CAddress.sendKeys("Pune");
    	 
    	 WebElement PAddress = driver.findElement(By.name("Permanent-Address"));
    	 PAddress.sendKeys("JalnaAshti");
    	 
    	 WebElement pin = driver.findElement(By.name("Pincode"));
    	 pin.sendKeys("431507");
    	 
    	 WebElement relision = driver.findElement(By.name("Pincode"));
    	 relision.sendKeys("Relegion");
    	 
    	 Select s3 = new Select(relision);
    	 s3.selectByVisibleText("Hindu");
    	 
    	 //This accept only pdf file 
    	 WebElement fileupload  = driver.findElement(By.id("file"));
    	 fileupload.sendKeys("C:\\Users\\Lenovo\\Downloads\\SwatiPDF.pdf"); //paste location of the file
    	 
    	 WebElement checkbox =  driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
    	 checkbox.click();
    	 
    	 WebElement Submit = driver.findElement(By.name("Submit"));
		 Submit.click();
		 
		
		 
		 

	}

}
