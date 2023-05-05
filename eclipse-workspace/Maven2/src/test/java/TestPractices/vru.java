package TestPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//if you put test at class level then it will execute all method at class level
public class vru
{
	
	
    ChromeOptions options=new ChromeOptions();
    
   
   WebDriver driver=new ChromeDriver(options);
    
    
  
	
	
   @Test(priority=1,description="launch")
   public void test1()
   {
	  
	   driver.get("https://demo.actitime.com/login.do");
	   boolean b=driver.findElement(By.id("loginButton")).isDisplayed();
	//   Assert.assertTrue(b);
   }
   
   
 // @Parameters ({"username","password"})
//@Test (priority=2,description="login")
   
   @Test(dataProvider="sc")
  public void test2(String user, String pass) throws InterruptedException
  {
	  
	  driver.findElement(By.id("username")).sendKeys(user);
	  driver.findElement(By.name("pwd")).sendKeys(pass);
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  String current=driver.getCurrentUrl();
	  boolean c=false;
	  if(current.equals("https://demo.actitime.com/user/submit_tt.do"))
	  {
		  c=true;
	  }
	  Assert.assertTrue(c);
  }
  
  @DataProvider(name="sc")
  public static Object[][] logincredentioal()
  {
	return new Object[][] {{"admin","manager"},{"admin","admin122"}};
	  
  }
  
  @Test  (priority=3, description="geturl")
  public void test3()
  {
	  String d=driver.getCurrentUrl();
	  String j="https://demo.actitime.com/user/submit_tt.do";
	  Assert.assertEquals(d, j);
  }
  
  //for ignore=@ignore
  //enabled is like isenabaled or not
  //even it disable then also we also need to work then use
  
  @Ignore
  @Test  (priority=4,description="logout") //(priority=4 ,description="logout",dependsOnMethods="test3",enabled=true , alwaysRun=true)
  public void test4()
  {
	  driver.findElement(By.id("logoutLink")).click();
  }

  
}

