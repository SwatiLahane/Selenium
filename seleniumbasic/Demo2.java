package seleniumbasic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException
	{
	   
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		Thread.sleep(3000);
		
		
		driver.get("https://www.google.com");
		Thread.sleep(3000); //it will slepp for 3 seconds
		
		
		System.out.println(driver.getWindowHandle()); //give parent Id
		
		System.out.println(driver.getWindowHandles()); //give parent n child Id
		
		String title = driver.getTitle(); //get the title of the page 
		System.out.println(title); //Google
		
		
		
		
		driver.close();//to close the parent tab

	}

}
