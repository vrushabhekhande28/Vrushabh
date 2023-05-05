import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class javaScript
{
      WebDriver driver;
      ChromeOptions option=new ChromeOptions();
      
      
      @BeforeMethod
      public void data()
      {
    	   option.addArguments("remote-allow-origins=*");
    	   driver=new ChromeDriver(option);  
    	   
    	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    	    driver.manage().window().minimize();
    	   // driver.get("https://demo.actitime.com/login.do");
    	    
    	    driver.get("https://letcode.in/edit");
      }
      
      @Test
      public void test1()
      {
    	  
    	// WebElement we= driver.findElement(By.xpath("//div[text()='Login ']"));
    	 JavascriptExecutor jse=(JavascriptExecutor)driver;
    	 
    	 //JAVAsCRIPTEXECUTOR  USED FOR ALART GENRATUION 
        //jse.executeScript("alert('Hii bro how are you,are you ok')");
    	 
    	 
    	 //click operation if element is disabled  
    	// jse.executeScript("arguments[0].click();",we);
    	 
    	 //draw a border  in red color ecause there is an bug if bug found
    	// jse.executeScript("arguments[0].style.border='3px solid red'", we);
    	 
    	 //how to refresh browser with javaScript
    	// jse.executeScript("history.go(0)");
    	     	 
    	 //scrollong operations
    	 //jse.executeScript("scrollBy(200,400)");
    	 
    	 
    ////	WebElement we1=  driver.findElement(By.xpath("//div[@class='tooltip-content']"));
    	// jse.executeScript("arguments[0].value='we';",we1);
    	 
    	 
    	WebElement litcode= driver.findElement(By.id("noEdit"));
    	
    	
    	//how to pass data if field is getting disabled
     //  jse.executeScript("arguments[0].value='vrusah'", litcode);
       //jse.executeScript("document.getElementById('noEdit').value='d'");
    	
    	
    WebElement we=	driver.findElement(By.xpath("//*[text()='LetCode']"));
    jse.executeScript("arguments[0].scrollIntoView(true);", we);
    	
    	
      }
      
      
      @Test
      public void test2()
      {
    	  test1();
      } 
     

      
      
      
}
