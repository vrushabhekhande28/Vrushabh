package para;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

/*
Q>  if we give negatinve priority
==> As per the lower priorty it will start executes

 Q>Attributes of Test
 ==> priority
     description
     dependson
     invocationCount
     
     
     Q>How o ignore Test At test level
     @Ignore annotation at class level or at test level 
     and you can also put at package level but  for that right click on src and then create new package of java.info. somethinf
     and the provided there ignore  annotation and then try it
     
     or
     
     you can also used one attribute i.e. enable=true/false
     
       
   q> what happen if we provided @test at class level
   It will considerd all the method @Test level no need to write everyTimr @test at method level ecen if you write class level at only once its ok not issue
 
 
 Q> how to genrate testng manually
 ==>    right click on package go to new option select and  enter filename.xml
 
   inside suite by default classses and  
 */


public class LiginTEstScript 
{    
	 WebDriver driver;
	 ChromeOptions opt=new ChromeOptions();
	
	 @BeforeMethod(groups="vr")
      public void Setup()
      {
    	  opt.addArguments("--remote-allow-origins=*");
    	  driver=new ChromeDriver(opt);
    	  driver.get("https://demo.actitime.com/login.do");       
      }
       
	 @Parameters({"username","password"})
	 @Test(priority=1, description="login page of actitime",groups="vr")
      public void login(String usern,String pass)
      {
    	    driver.findElement(By.id("username")).sendKeys(usern);
    	    driver.findElement(By.name("pwd")).sendKeys(pass);
            driver.findElement(By.id("loginButton")).click();
            
      }
       /*
	 @Test(priority=2,dependsOnMethods="login",groups="vr", description="after login page page diaspplayed as per requirement or not conformation")
      public void url() throws InterruptedException
      {
		 Thread.sleep(2000);
    	 String url=  driver.getCurrentUrl();
    	 String actualUrl="https://demo.actitime.com/user/submit_tt.do";
    	 
    	 if(url.equals(actualUrl))
    		 System.out.println(true);
    	 else
    		System.out.println(false);
    	 Assert.assertEquals(url, actualUrl);
      }
         
	 @Test(priority=3,description="title conformation",dependsOnMethods="url",groups="vr")
      public void title() throws InterruptedException
      {
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 Thread.sleep(4000);
    	   String t=driver.getTitle();
    	   System.out.println(t);
    	   String g="actiTIME - Enter Time-Track";
    	   //actiTIME -  Enter Time-Track
    	  Assert.assertEquals(t, g);
      }
      */
	
  /*
      public void logout() throws InterruptedException
      {
    	    driver.findElement(By.id("logoutLink")).click();
    	   
    	     String a= driver.getCurrentUrl();
    	     String b= "https://demo.actitime.com/login.do";
    	     
    	    Assert.assertEquals(a, b);
    	    
      }  
    */
      
      //@Test(priority=5 , description="here logout operation will be proceed", dependsOnMethods="logout")
      @AfterMethod() 
	 public void cloe()
      {
    	  driver.close();
      } 
}
