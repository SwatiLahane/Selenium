package facebook_Test_Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import facebook_Souce_Pom.Registration;

//import registration_Souce_Pom.Registration;
//Generate Xml File For Test folder two files
//Write Click on project-> TestNg->Convert to TestNg
//RUn it from xmal file ->right click->RunAS->TestNg Suite

public class Create_new_Account
{
    WebDriver driver;
	
	@Test
	public void Registration_Test() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		
		//facebook_Souce_Pom.Registration obj1 = new facebook_Souce_Pom.Registration(driver);
	    Registration obj1  = new Registration(driver);
		 
	    //Thread.sleep(2000)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
	    // Thread.sleep(2000);
	     obj1.CreateNewAccount();
		 obj1.firstname();
		 obj1.lastname();
		 obj1.emailid();
		 obj1.passwrd();
		 obj1.day();
		 obj1.month();
		 obj1.year();
		 obj1.gender();
		 obj1.button();
		 
		 
		 
   }

}