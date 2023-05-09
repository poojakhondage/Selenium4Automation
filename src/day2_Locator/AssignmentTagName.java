package day2_Locator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTagName {

	public static void main(String[] args)  
	{
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		 //UserName
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//Login
		driver.findElement(By.className("oxd-button")).click();
		
		//LogOut
		driver.findElement(By.className("oxd-userdropdown-icon")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
		
		
		/*//number of inputs
		List<WebElement> list1= driver.findElements(By.tagName("input"));
		System.out.println("Total Input boxes: "+list1.size());
		
		//links 
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		*/
		
		

	}

}
