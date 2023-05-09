package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class FirstTestcase {

	public static void main(String[] args)
	{
       
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	     System.out.println("Application title: "+driver.getTitle());
	     
	     driver.close();
	     
	     

	}
	
	    
		  


}