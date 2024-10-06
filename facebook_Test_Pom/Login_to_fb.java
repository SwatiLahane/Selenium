package facebook_Test_Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import facebook_Souce_Pom.Facebook_Login;


public class Login_to_fb 
{
    
WebDriver driver;
	
	@Test
	public void login_with_correct_cred()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		///driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Facebook_Login obj = new Facebook_Login(driver);
		obj.uname();
		obj.pswrd();
		obj.loginbutton();
		
		//Create xml file for this n then run
	 }
	
}
