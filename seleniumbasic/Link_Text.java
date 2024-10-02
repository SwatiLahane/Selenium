package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Q .Lauch google and click on gmail using linkText 
public class Link_Text 
{ 
    public static void main(String[] args)
    {
       ChromeDriver driver = new ChromeDriver();
       
       driver.get("https://www.google.com");
       
       driver.manage().window().maximize();
       
       WebElement E1= driver.findElement(By.linkText("Gmail"));
       E1.click();
       
    }
    
}
