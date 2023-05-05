package Pra;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class vrushabh 
{
	WebDriver driver;
	ChromeOptions options=new ChromeOptions();
	
   @Test(priority=1 ,groups={"vr"})
   public void Lauch()
   {
	     options.addArguments("--remote-allow-origins=*");
	     driver=new ChromeDriver(options);
	     driver.get("https://letcode.in/test");     
   }
   
   
   @Test(priority=2 ,groups={"vr"})
   public void vru()
   {
	      driver.findElement(By.xpath("//a[text()='Drop-Down']")).click();   
   }
   
   
   @Test(priority=3 ,groups={"vr"})
   public void sen()
   {
	     WebElement option= driver.findElement(By.id("fruits"));
	       Select se=new Select(option);
	        List<WebElement> opt=se.getOptions();
	       
	    for(WebElement we: opt)
	    {
	    	 String wed=we.getText();
	    	 System.out.println(wed);
	    }
	   
   }
   
   
   @Test(priority=4)
  public void sens()
  {
	   WebElement we=driver.findElement(By.id("superheros"));
	   Select sel=new Select(we);
	   
	   
	   
	   List<WebElement> e=sel.getOptions();
	   for(WebElement opt: e)
	   {
		   String o=opt.getText();
		   System.out.println(o);
	   }
	   
	   
  }
   
   
   
   
   
   
   
}
