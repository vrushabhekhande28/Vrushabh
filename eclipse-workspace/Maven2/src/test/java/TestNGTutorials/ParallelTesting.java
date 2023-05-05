package TestNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParallelTesting
{
	  WebDriver driver;
	  ChromeOptions option=new ChromeOptions();
	  
	
  @BeforeClass	
  public void test()
  {
	  option.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(option);
	     
  }
  
  @Test
  public void Test11()
  {
	  driver.get("https://www.browserstack.com/guide/read-data-from-excel-using-selenium");
  }
  
  
  @Test
  public void Test12()
  {
	  driver.get("https://www.browserstack.com/guide/read-data-from-excel-using-selenium");
  
  }
  
  
  @Test
  public void Test1()
  {
	  driver.get("https://www.browserstack.com/guide/read-data-from-excel-using-selenium");

  }
  
  @Test
  public void Test13()
  {
	  driver.get("https://www.browserstack.com/guide/read-data-from-excel-using-selenium");

  }
  
  
}

