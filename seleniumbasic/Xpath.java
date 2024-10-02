package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
         
	
	 //Absolute xpath starting from grandparent parent child
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/learningHTML1.html");
		
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("Manish");

		WebElement e2 = driver.findElement(By.xpath("(/html/body/form)[2]/input[1]"));
		e2.click();
		
		
		
		
	}

}
