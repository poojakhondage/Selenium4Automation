package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTestValidationTest {

	public static void main(String[] args) 
	{
		
        //open browser
		WebDriver driver=new ChromeDriver();
		
		//to open application
		driver.get("https://www.google.com");
		
		//To get application title
		String title=driver.getTitle();
		System.out.println("Application title is: "+title);
		
		//Validation 
		
		if(title.equals("Google"))
		{
			System.out.println("Title matched.......Test Pass!");
			
		}else
		{
			System.out.println("Title matched.........Test Fail!");
			
		}
	}

}

