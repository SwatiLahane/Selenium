package facebook1_Source_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_For_Result
{
	
	
	//Xpath//input[@type='search'][1]
	
	 //1.Locating the Each Component by using find by element
	 
	 @FindBy(xpath ="(//input[@type='search'])[1]")
	 WebElement SearchTextField;
	
	
	 //2
	 public void SearchTextField()
	 {
		 SearchTextField.sendKeys("Poonam Ladda Bothara");
	 }
	
	 

		//step 3 Initilising the elemnts using Pagefactory Class inside the constructor
	    
		public  Search_For_Result(WebDriver driver) //Parameterised constructor
		{
			PageFactory.initElements(driver,this);
		}

}
	


