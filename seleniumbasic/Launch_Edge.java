package seleniumbasic;


import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge {

	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		
	 	driver.get("https://www.google.com");
		Thread.sleep(3000); //it will slepp for 3 seconds
		
		
		System.out.println(driver.getWindowHandle()); //give parent Id
		
		System.out.println(driver.getWindowHandles()); //give parent n child Id
		
		//but as of now we only have parent tab which is google.com
       
	}

}
 