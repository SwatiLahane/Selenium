package fb_test_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import fb_source_pom.Fb_LoginPage;

public class Login_To_facebook 
{
	WebDriver driver;
	
	@Test
	public void login_with_correct_cred()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	    
		Fb_LoginPage obj = new Fb_LoginPage(driver);
		
		obj.loginbutton();
		obj.pswrd();
		obj.loginbutton();
		
	}
}
