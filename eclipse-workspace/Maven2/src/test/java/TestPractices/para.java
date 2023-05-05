package TestPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class para 
{
	 WebDriver driver;
	 ChromeOptions opt=new ChromeOptions();
	
	 @BeforeMethod
     public void Setup()
     {
   	  opt.addArguments("--remote-allow-origins=*");
   	  driver=new ChromeDriver(opt);
   	  driver.get("https://demo.actitime.com/login.do");       
     }
	   
		 @Parameters({"username","password"})
		// @Test(priority=1, description="login page of actitime",groups="vr")
		 @Test
	      public void login(String usern,String pass)
	      {
	    	    driver.findElement(By.id("username")).sendKeys(usern);
	    	    driver.findElement(By.name("pwd")).sendKeys(pass);
	            driver.findElement(By.id("loginButton")).click();
	            
	      }
	  @AfterMethod
		 public void cloe()
	      {
	    	  driver.close();
	      } 
}
