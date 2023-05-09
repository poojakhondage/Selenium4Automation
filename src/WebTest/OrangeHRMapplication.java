package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMapplication {

	public static void main(String[] args) 
	{
          //open browser
		WebDriver driver=new ChromeDriver();
		
		
		//to open application
		driver.get("https://www.orangehrm.com/");
		
		//To get application title
		String title=driver.getTitle();
		System.out.println("Application title is: "+title);
		
		//Validation
		
		String actTitle = driver.getTitle();
		
		String ExpTitle =  "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM";
		
		if(title.equals(ExpTitle))
		{
			System.out.println("Title matched...........Test Pass!");
			
		}
		else
		{
			System.out.println("Title not matched........Test Fail!");
			
		}
		
		//get and print current URL 
		System.out.println("Current URL is: " + driver.getCurrentUrl());
		
		//Close browser
		//driver.close();
		driver.quit();
		
	
			
			
		
	}

	
}
