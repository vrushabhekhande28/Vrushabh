package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class cross
{
    WebDriver driver;
    ChromeOptions opt=new ChromeOptions();
    

    @Test(priority=1)
    @Parameters("browser")
    public void setup(String browser)
    {   
    	  opt.addArguments("--remote-allow-orings=*");
    	  if(browser.equals("chrome"))
    	  {
    		  driver=new ChromeDriver(opt);
    	
    	  }
    	  
    	  else
    	  {
    		  driver=new ChromeDriver(opt);
        	
    	  }
    	  
    
    	  
    }
}
