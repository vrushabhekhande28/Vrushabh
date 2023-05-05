import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1
{
	ChromeOptions option=new ChromeOptions();
	WebDriver driver;
     @BeforeTest
     public void m1()
     {
    	 option.addArguments("--remote-allow-origins=*");
    	  driver=new ChromeDriver(option);
    	 
    	   driver.manage().window().minimize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   driver.get("https://letcode.in/dropdowns");
    	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    	   
     }
     
     @Test
     public void login() throws IOException
     {
    	 /*
    	//driver.findElement(By.id("username")).sendKeys("admin");;
    	JavascriptExecutor jse=(JavascriptExecutor)driver;
    	jse.executeScript("document.getElementById('username').value='admin';");
    	  driver.findElement(By.name("pwd")).sendKeys("manager");;
    	  LocalDateTime time=LocalDateTime.now();
  	      String s=time.toString();
  	      s=s.replace(':', '-');
    	  WebElement we=driver.findElement(By.id("loginButton"));
    			  we.getScreenshotAs(OutputType.FILE);
    	  File tempfile = we.getScreenshotAs(OutputType.FILE);
  	    File file=new File("./Maven2/errorgase/img"+s+".png");
  	    FileUtils.copyFile(tempfile, file);
  	    */
    	  
    	  /*
    	    LocalDateTime time=LocalDateTime.now();
    	    String s=time.toString();
    	    s=s.replace(':', '-');
    	    System.out.println(s);
    	    TakesScreenshot ss=(TakesScreenshot)driver;
    	    File tempfile = ss.getScreenshotAs(OutputType.FILE);
    	    File file=new File("./Maven2/errorgase/img"+s+".png");
    	    FileUtils.copyFile(tempfile, file);
    	    */
    	  
    	  
    	
    	 /*
        JavascriptExecutor jse=(JavascriptExecutor)driver;
       int d= (Integer) jse.executeAsyncScript("document.body.scrollHeight");
       System.out.println(d);
       WebElement we = null;
       
       
       //for parrenr
       driver.switchTo().parentFrame();
       driver.switchTo().defaultContent()
   
        driver.switchTo().frame(we);
        */
    	 
    	 /*
    	 
    	 
   WebElement we=   driver.findElement(By.id("fruits"));
   
        Select select=new Select(we);
        select.getOptions();
      //  select.selectByIndex(3);
       // select.selectByValue("1");
       select.selectByVisibleText("Apple");
       System.out.println();
       
        */
    	 
    	    /*
    	 	moveToElement(WebElement we)
            moveToElement(WebElement We,1,1)
            clickAndHold()
            click()
            click(WebElement we)
            release()
            release(WebElement we)
            DragAndDrop()
            DragAndDrop(WebElement we,WebElemet we1)
            KeysDown()
            KeysUp(charSeq..ad)
            moveByOffset(int x,inty)
            contextClick()
            
            
            
            */
            
            
    	 /*
    	  action.keysDown(Keys.control).perform();
    	  action.click(12);
    	  action.keysUp(keys.control).perform;
    	  */
    	 
       /*
         Types of pop ups
            1.authonticatuon popups
            2.notification
            3.file upload
            4.file download
            5.window popups
            
        
        */
            

     }

}  
