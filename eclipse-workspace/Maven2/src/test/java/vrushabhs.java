import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vrushabhs
{
	
	WebDriver driver;
	ChromeOptions options=new ChromeOptions();
   @BeforeTest
   public void preesetUp()
   {
	      options.addArguments("--remote-allow-origins=*");
	      driver =new ChromeDriver();
	      driver.manage().window().minimize();     
   }
   
   
   @Test
   public void t0()
   {
	   options.addArguments("--remote-allow-origins=*");
	     driver.get("file:///C:/Users/Asus/Downloads/pratice.html?");
   }
   
   
   @Test (priority =1)
   public void t1()
   {
	   options.addArguments("--remote-allow-origins=*");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   JavascriptExecutor jse=(JavascriptExecutor)driver;
	   driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("d");;
	   driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("vr");
	  jse.executeScript(" driver.findElement(By.cssSelector(\"input[type=\\\"submit\\\"]\")).click()");
	  
   }
   
   
 
}
