package day2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args)
	{
      
		WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//First name
		driver.findElement(By.name("firstname")).sendKeys("Pooja");
		
		//Last Name
		driver.findElement(By.name("lastname")).sendKeys("Khondage");
		
		//email
		driver.findElement(By.id("input-email")).sendKeys("Khondage999@gmail.com");
		
		//Telephone
		driver.findElement(By.name("telephone")).sendKeys("9960207390");
		
		
		System.out.println("***************Password***************");
		 
		// Password 
        driver.findElement(By.name("password")).sendKeys("242590");	
        
		//Confirm password
        driver.findElement(By.name("confirm")).sendKeys("242590");
        
		
		System.out.println("^^^^^^^^^^^^^^^Password details^^^^^^^^^^^^^");
		
		//NewsLetter
		driver.findElement(By.name("newsletter")).click();
		
		
		//check box
		driver.findElement(By.name("agree")).click();
		
		//Continue Button
		driver.findElement(By.className( "btn-primary")).click();
		
		//
		
		
		
	}   
             
	   
}
