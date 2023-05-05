package TestNGTutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
	
	ChromeOptions  options=new ChromeOptions();
	WebDriver driver;

   @BeforeMethod(groups="url")
   public void setUp()
   {
	  options.addArguments("--remote-allow-origins=*");
	 
	  driver=new ChromeDriver(options);
	  driver.get("https://www.google.com/");
	  driver.manage().deleteAllCookies();
	  driver.manage().window().minimize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  
   }
   
   @Test(priority=1,groups="url")
   public void verifyUrl()
   {
	  String current=driver.getCurrentUrl();
	  String actual="https://www.google.com/";
      Assert.assertEquals(current, actual);
   }
   
   @Test(priority=2,groups="findElementss")
   public void ElementDisplay()
   {
	    boolean b=  driver.findElement(By.name("q")).isDisplayed();
	     
   }
   
   @Test (priority=3,groups="findElementss")
   public void ElementDisplay1()
   {
	  boolean b= driver.findElement(By.xpath("//*[@class=\"goxjub\"]")).isDisplayed();
	  Assert.assertTrue(b);
   }
   
   @Test(priority=4,groups="findElementss")
   public void ElementDispkayTest2()
   {
	  boolean b= driver.findElement(By.xpath("//*[@class=\"Gdd5U\"]")).isDisplayed();
      Assert.assertTrue(b);
   }
   
   
   @AfterMethod
   public void AfterTest()
   {
	   	driver.close();
   }
}
