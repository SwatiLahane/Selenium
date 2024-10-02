package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin_Relativexpath {

	public static void main(String[] args)
	{   
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26hvadid%3D590652406969%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9302986%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D10232975654874319878%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_2265395%26ie%3DUTF8%26index%3Daps%26keywords%3Dlogin%2520amazon%2520account%26ref%3Dpd_sl_2cwzc6x246_e%26tag%3Dgooginhydr1-21%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"); 
		
		WebElement uesername = driver.findElement(By.xpath("((//input)[8])"));
		uesername.sendKeys("Swati123@gmail.com");
		
		WebElement button = driver.findElement(By.xpath("((//button"));
		uesername.click();
		
	}
   

}
