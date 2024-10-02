package seleniumbasic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver  = new ChromeDriver();
        
		driver.get("https://www.google.com"); //it launch google.com in browser 
		
		Thread.sleep(3000); //It will sleep for a memoment of time  
		
		
		driver.close(); //It will close browser
		
		//driver.quit();//it will parent n child browser or tabs
		
		
	}

}
