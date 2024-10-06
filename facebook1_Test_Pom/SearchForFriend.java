package facebook1_Test_Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import facebook1_Source_Pom.Search_For_Result;


public class SearchForFriend 
{

	WebDriver driver;
	
	@Test
	public void login_with_correct_cred()
	{
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		Search_For_Result obj = new Search_For_Result(driver);
		
		obj.SearchTextField();
		
	 }
	
	
	
	
}
