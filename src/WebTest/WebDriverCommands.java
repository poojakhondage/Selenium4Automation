package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) 
	{
		//To Open Browser
		WebDriver driver=new ChromeDriver();

		//to open application
				driver.get("https://www.amazon.com");
				
          //To get page source of page - getPagesource
			System.out.println(driver.getPageSource());
	} 
	
	
	

}
