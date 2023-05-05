package EveryTHingAboutTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class parallel 
{

	 WebDriver driver;
	 ChromeOptions opt=new ChromeOptions();
	
	 @Test(priority=1 )
     public void Setup()
     {
   	  opt.addArguments("--remote-allow-origins=*");
   	  driver=new ChromeDriver(opt);
   	  driver.get("https://demo.actitime.com/login.do");       
     }
	 
	 @Test
	  public void Setu()
     {
		 opt.addArguments("--remote-allow-origins=*");
   	     driver =new ChromeDriver(opt);
   	     driver.get("https://letcode.in/test");
     }
	 
}
