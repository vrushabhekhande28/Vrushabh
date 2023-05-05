package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PAeallel 
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
	  
	  //click on class filr and right click and go to testng and convert t testng.xml 
	  // and then option is there for parallel execution you just ckick on that and for 
	  //for class having number of method so select method option  in testng during converting 
	  // in this way parllel execution will happen an
	  
}
