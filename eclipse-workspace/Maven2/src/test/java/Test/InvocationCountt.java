package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountt 
{
	
	  WebDriver driver=new ChromeDriver();
	  
	  @Test (priority=1)
	  public void create()
	  {  
		  System.out.println("account executed");
	  }
	  
	  @Test (priority=2)
	  public void modiefy()
	  {
	      System.out.println("account modified");
	  }
	  
	  @Test (invocationCount=2)
	  public void delete() 
	  {
		  System.out.println(("Account deleted"));
	  }
}
