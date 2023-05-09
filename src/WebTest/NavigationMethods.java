package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.google.com");
       System.out.println("Title is: "+driver.getTitle());
       
       //Navigation
       driver.navigate().to("https://www.flipkart.com");
       System.out.println("Title is: "+driver.getTitle());
       
	      Thread.sleep(3000);
	     // back()
       driver.navigate().back();
	      Thread.sleep(3000);

       // forward()
       driver.navigate().forward();
	      Thread.sleep(3000);

       //refresh()
       driver.navigate().refresh();
	      Thread.sleep(3000);

	
	}
	
}
