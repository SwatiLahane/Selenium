package facebook_Souce_Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registration
{
    //Inside Test file we need two classes
	//1.login page -Click create new account button
	//2.Registration page - perform action on each component 
	
	   @FindBy(xpath = "(//a[@role = 'button'])[2]")
	    WebElement CreateNewaccount;
	
	  //step1 Locating each componenet using @FindBy Annottaion
		@FindBy(id="u_n_8_oy")
		WebElement FirstName;
	   
		@FindBy(name="lastname")
		WebElement LastName;
		
		@FindBy(xpath=("//input[@name ='reg_email__'])"))
		WebElement EmailId;
		
		@FindBy(id="password_step_input")
		WebElement Password;
		
		@FindBy(id="day")
		WebElement Day;
		
		@FindBy(id ="month")
		WebElement Month;
		
		@FindBy(id = "year")
        WebElement Year;
		
		@FindBy(xpath=("//label[.='Female']"))
        WebElement Gender;
		
		@FindBy(xpath=("//button[.='Sign Up'])[1]"))
        WebElement SignUpBtn;
		
		//step 2 Creating seperate methods for each componnet to perform its action
        
		public void CreateNewAccount()
		{
			CreateNewaccount.click();
		}
		
		public void firstname()
		{
			FirstName.sendKeys("Swati");
		}
		public void lastname()
		{
			LastName.sendKeys("Lahane");
		}
		public void emailid()
		{
			EmailId.sendKeys("lahaneswati24@gmail.com");
		}
		public void passwrd()
		{
			Password.sendKeys("Swati@12");
		}
		public void day()
		{   
		   Select s1 = new Select(Day);
		   s1.selectByVisibleText("21");
			  
		}
		
		public void month()
		{
		    Select s2 = new Select(Month);
			s2.selectByVisibleText("Sep");
		}
		public void year()
		{
			 Select s2 = new Select(Month);
			 s2.selectByVisibleText("24");
		}
      public void gender()
         {
	        Gender.click();
         }
      
      public void button()
      {
    	  SignUpBtn.click();
      }
      
    //step 3 Initilising the elemnts using Pagefactory Class inside the constructor
	    
      public Registration(WebDriver driver) //Parameterised constructor
		{
			PageFactory.initElements(driver,this);
		}
    		
    		
    		
    		
      
    		  
    		  
}