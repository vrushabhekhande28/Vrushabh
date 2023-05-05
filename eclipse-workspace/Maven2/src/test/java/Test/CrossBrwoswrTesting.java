package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrwoswrTesting 
{
	
	WebDriver driver;  // here i just globally variable
   @Test
   @Parameters   ("webBroserName") //for cross browser testing you need to use parameters
   public void lauch(String webBroserName)
   {
	  if(webBroserName.equals("Chrome"))
	  {
		    driver=new ChromeDriver();
	  }
	  else if(webBroserName.equals("Firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  driver.get("https://www.selenium.dev/");
	  
	  //after select right click and convert to testng
	  //after in xml add classes tag and parameter tag add
	  //after changes in class do again xml filr genrates
   }
   
      
}
