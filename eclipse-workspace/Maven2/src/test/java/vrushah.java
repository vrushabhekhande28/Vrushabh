import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

public class vrushah 
{
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
	   driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	   driver.manage().window().minimize();
	}

	@BeforeClass
   public void lauch()
   {
	   driver.get("https://www.flipkart.com/infinix-note-12i-force-black-64-gb/p/itmf9bf9f4663d76?pid=MOBGHXSMGZTRYYVY&param=678&otracker=clp_bannerads_1_4.bannerAdCard.BANNERADS_xfdg_mobile-phones-store_CUFDPX9XF7DD");  
   }
	
	@Test(description="senkeys operaion",priority=1)
	public void testcase1()
	{
	//driver.findElement(By.cssSelector("*[class=\"_2KpZ6l _2doB4z\"]")).click();
	WebElement we=driver.findElement(By.className("_3704LK"));
	we.click();
	we.sendKeys("sendKey");
	String s=we.getText();
	System.out.println(s);
	}
	
	
	@Test(description="tagname",priority=2)
	public void vrushabh()
	{
		WebElement we=driver.findElement(By.className("_3704LK"));
		System.out.println(we.getTagName());
		
	}
	
	@Test(priority=3)
	public void bt()
	{
		WebElement wree=driver.findElement(By.className("_3704LK"));
		//wree.click();
		wree.sendKeys(Keys.CONTROL+"A");
		wree.sendKeys(Keys.CONTROL+"C");
		wree.sendKeys(Keys.CONTROL+"V");
		wree.sendKeys(Keys.CONTROL+"V");
	}
	
	@Test(priority=4 , description ="dc")
	public void b()
	{
		WebElement wree=driver.findElement(By.className("_3704LK"));
		//wree.click();
		String d=wree.getAttribute("type");
		System.out.println(d);
	}
	
	
	@Test(priority=4 , description ="cssValues")
	public void css()
	{
		WebElement wree=driver.findElement(By.className("_3704LK"));
	     wree.getCssValue("width");
	}

	
	//@Vr/../../..
	@Test(description="getsizeof",priority=5)
public void mf()
{
		WebElement wree=driver.findElement(By.className("_3704LK"));
		Dimension dim=wree.getSize();
		int x=dim.getHeight();
	    int y= dim.getWidth();
	     
	       System.out.println(x);
	       System.out.println(y);
}
	
	@Test(priority=6,description="Locations")
	public void getlo()
	{
	    Point p=driver.findElement(By.className("_3704LK")).getLocation();
	    int y= p.getX();
	    int z=p.getY();
	    System.out.println(y);
	    System.out.println(z);
	}

	@Test(priority=7)
	public void mdxdf()
	{   
		WebElement we=driver.findElement(By.className("_3704LK"));
		org.openqa.selenium.Rectangle rect = we.getRect();
		    rect.getHeight();
		    rect.getWidth();
		    rect.getX();
		    rect.getY();
	}

	@Test(priority=8)
	public void d()
	{
		  WebElement we=driver.findElement(By.className("_3704LK"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(we));    
	}
	
	
	@Test(priority=9)
//	public void mg()
//	{
//	   WebElemen we=driver.findElement(By.className("_3704LK"));
//	   WebDriverWait ver=new WebDriverWait(driver,Duration.ofSeconds(10));
//	   ver.until(ExpectedConditions.invisibilityOf(we));
//	}
//	
	
	

   public void habh()
   {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	       LocalDateTime d= LocalDateTime.now();
	          String dx=d.toString();
	          dx=dx.replace(':','-');
	         System.out.println(d.toString());
	       System.out.println(d);
	     TakesScreenshot sc=(TakesScreenshot)driver;
	      File f=sc.getScreenshotAs(OutputType.FILE);
	      File fil=new File("./vrushabh/img"+dx+".png");
	      f.renameTo(fil); 
   }
	
	public void vrushab()
	{
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		  wait.until(ExpectedConditions.alertIsPresent());
		  	  
	}
	
	
	@Test(priority=10)
	public void nf()
	{
		
		LocalDateTime currentTime=  LocalDateTime.now();
		String Scurrent=currentTime.toString();
		Scurrent=Scurrent.replace(':','-');
        TakesScreenshot ss=(TakesScreenshot)driver;
        File temp=ss.getScreenshotAs(OutputType.FILE);
        File dile=new File("./Screeeee/failedtestcase"+Scurrent+".png"+driver.getTitle());
      temp.renameTo(dile);
      
        
        
	}
	
	@Test(priority=11)
	public void getScreenShotOFElement() throws IOException
	{
		
     WebElement we= driver.findElement(By.cssSelector("*[class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]"));
	  LocalDateTime g= LocalDateTime.now();
	    String dx=g.toString();
	   String k=dx.toString();
	   k= dx.replace(':', '-');
	    if(we.isDisplayed())
	    {
	    
	  TakesScreenshot ss=(TakesScreenshot)driver;
	  File f=ss.getScreenshotAs(OutputType.FILE);
	  
	  
	 
	 File s = new File("./dxc"+"/img"+k+".png");
	 FileUtils.copyFile(f, s);
	
	 
	 
        
	 
    
	    }
	 
	    
	    
	  
	
	  
	
	}
	
	
	@Test	(priority=11)
	public void jse()
    {
		
          JavascriptExecutor d=(JavascriptExecutor)driver;
          d.executeScript("window.scrollTo(0,1000)");
          System.out.println(d.executeScript("window. scrollTo(0, document. body. scrollHeight"));
         
          
     
    }
  
	
	
	public void f()
	{
		 
	}
}

	