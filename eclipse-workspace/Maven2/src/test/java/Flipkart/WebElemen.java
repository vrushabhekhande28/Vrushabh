package Flipkart;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebElemen 
{
	 WebDriver driver;
	 WebElemen(WebDriver drive)
	 {
		 this.driver=drive;
	 }
	 
	 ChromeOptions option=new ChromeOptions();
	 
    //cancel button
    @FindBy (css ="button[class=\"_2KpZ6l _2doB4z\"]") WebElement w;
    
    //for search Box
    @FindBy (name="q") WebElement w1;
    
    //for 8gb and more option
    @FindBy(xpath="//div[contains(text(),'8 GB and Above')]") WebElement w3;
    
    //click on product 
   @FindBy(xpath="//div[contains(text(), 'Sparkling Blue,')]") WebElement w4;
   
   
   //notify me option
   @FindBy (xpath="//button[text()='NOTIFY ME']") WebElement w5;

   
 
   public void Setup()
   {
	      PageFactory.initElements(driver, this);
	 //     option.addArguments("--remote-allow-origins=*");
	  //    driver=new ChromeDriver(option);
	      
	        driver.get("https://www.flipkart.com/");
	      
   }
   
   
   public void url()
   {
	 String get=  driver.getCurrentUrl();
	 System.out.println(get);
	 String actual="https://www.flipkart.com/";
	 Assert.assertEquals(get, actual);
   }
   
   public void  softLoginWindowclick() 
   {
       w.click();
   }
    
   public void enetreproduct(String productName)
   {
	  w1.sendKeys(productName);
	  w1.sendKeys(Keys.ENTER);
   }
   
   public void selectRam() throws InterruptedException
   {
	   Thread.sleep(2000);
	   w3.click();
   }
   
   public String selectPhone() throws InterruptedException
   {
	  String first= driver.getWindowHandle();
	   Thread.sleep(2000);
	   w4.click();
	   return first;
   }
   
   
    public void SwitchToWindow(String fi)
    {
    	  String first=fi;
    	  
    	 Set<String> windowss= driver.getWindowHandles();
    	 
    	 for(String g: windowss)
    	 {
    		 if(!g.equals(windowss))
    		 {
    			 driver.switchTo().window(g);
    		 }
    	 }
    }
   
   public void checkNotifyOptionIsThere() throws InterruptedException
   {
	   Thread.sleep(2000);
	  boolean b= w5.isDisplayed();
	  if(b==true)
	  System.out.println("Currently phonr is not available");
	  else
	  System.out.println("curremtly phone is available");
   }
}
