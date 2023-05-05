package Pra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class vrushabh1
{
	WebDriver driver;
	ChromeOptions opt=new ChromeOptions();

  @Test(priority=1, description="fdfcj")
  @Parameters("browser")
  public void launch()
  {  
	  
	  opt.addArguments("--remote-allow-origins=*");
	  driver=new ChromeDriver(opt);
	  driver.get("https://letcode.in/test");
  }
  
  

   
  /*
  @Test(priority=2)
  public void s1Test()
  {
	  driver.findElement(By.xpath("//a[text()='AUI - 5']")).click();
  }
  
 
  @Test(priority=3 )
  public void se2()
  { 
	 WebElemen we= driver.findElement(By.id("generate"));
	 Actions act=new Actions(driver);
	 
	 act.dragAndDropBy(we, 20, 0)	;
  }
  */
  
  
}
