import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class vruvr
{
	  WebDriver driver;
	  
   @Test(priority=1)
   public void t0()
   {
       driver=new ChromeDriver();
       driver.get("https://www.tinytap.com/activities/gd92/play/drag-and-drop-practice");
   } 
   
   @Test(priority=2)
   public void t1()
   {
	//  WebElemen we=driver.findElement(By.id("doubleClickBtn"));
	  
	  
	   
	  /*
	 WebElemen w=  driver.findElement(By.id("draga"));
	 WebElemen w2=driver.findElement(By.id("dragb"));
	 
	 act.clickAndHold(w).moveToElement(w2).release().perform();
	 */
	   
	     
   }
   
   
  
   
   
}
