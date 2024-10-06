package facebook_Souce_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_Login
{
	  //step1 Locating each componenet using @FindBy Anotation
         
	   
	
		@FindBy(id="email") //return type of single element is webelement
		WebElement Username; //return type WebElement refrence variable Username
		
		@FindBy(name="pass")
		WebElement Password;
		
		@FindBy(xpath="//button[@name='login']")
		WebElement login_button;
		
		
	   	
		
		//step 2 Creating seperate methods for each componnet to perform its action
        
	
		public void uname()
		{
			Username.sendKeys("lahaneswati24@gmail.com");
		}
		public void pswrd()
		{
			Password.sendKeys("Swati@24"); //Enter Write Passwrd While running 
		}
		public void loginbutton()
		{
			login_button.click();
		}
		
		
		//step 3 Initilising the elemnts using Pagefactory Class inside the constructor
	    
		public Facebook_Login(WebDriver driver) //Parameterised constructor
		{
			PageFactory.initElements(driver,this);
		}
		
}
