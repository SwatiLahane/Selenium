package facebook1_Test_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import facebook1_Source_Pom.Login_TO_Facebook;


public class LogingToFacebook 
{   
	
	WebDriver driver;
	 @Test
	 public void login()
	 {
		 
		    driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		    
			Login_TO_Facebook obj = new Login_TO_Facebook(driver);
			obj.uname();
			obj.pswrd();
			obj.loginbutton();
			
			
	 }
	 
}
