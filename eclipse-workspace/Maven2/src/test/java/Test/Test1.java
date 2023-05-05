package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


//BY default testng work with alphabatically order  for our need or priority you need to use priority=
public class
Test1  
{
	WebDriver driver=new ChromeDriver();
  @Test (priority=1)
  public void flipkart()
  {
	  
	  driver.get("https://www.flipkart.com/");
  }
  
  @Test (priority=2)
  public void orangeHrm()
  {
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test (priority=3)
  public void leCode() 
  {
	  driver.get("https://letcode.in/test");
  }

}
