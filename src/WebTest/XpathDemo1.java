package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo1 {

	public static void main(String[] args)
	{
       
		WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");	
        //implicit wait
       
        
        
        
		//email
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@gmail.com");
        
        //password
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test1234");
        
        //login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        
	}
	

}
