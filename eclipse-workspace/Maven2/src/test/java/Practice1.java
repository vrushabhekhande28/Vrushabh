import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Practice1
{

	
	
	WebDriver driver;
  @BeforeTest
  public void setUp()
  {
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         	   
  }
  
  
    @Test
    public void launch()
    {
    	 driver.get("https://demo.actitime.com/login.do");
    }
 
   @Test
   public void Login()
   {
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));     
	     driver.findElement(By.id("username")).sendKeys("admin");
	     driver.findElement(By.name("pwd")).sendKeys("manager");
	    
   }
    
   public void logout()
   {
	   
   }
}

