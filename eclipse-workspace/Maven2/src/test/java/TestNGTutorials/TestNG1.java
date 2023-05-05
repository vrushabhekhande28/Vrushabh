package TestNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1
{
     //Pre Conditions
     @BeforeSuite
     public void Setup()
     {
    	  System.out.println("@BeforeSuite: "+"setup");
     }
     
     
     @BeforeTest
     public void Lauch()
     {
    	 System.out.println("@BeforeTest: "+"lauch the URl");
    	
     }
     
     @BeforeClass
     public void CheckPoperUrlLaunched()
     {
       System.out.println("@BeforeClass: "+"Check proper webSite lauch or not");
     }
     
   
     //Test Conditions 
     @Test
      void test1()
     {
       System.out.println("@Test: "+"Test");
     }
     
     
     @Test
     void test2()
     {
       System.out.println("@Test: "+"Test2");
     }
     
     
     public void test3()
     {
       System.out.println("@Test: "+"Test3");
     }
     
     
     //post conditions

     @AfterClass
     public void cookies()
     {
       System.out.println("@Test: "+"Delete the cookies of this website"); 
     }
     
     @AfterTest
     public void  checkUrl()
     {
       System.out.println("@Test: "+"close "); 
     }
     
     @AfterSuite
     public void close()
     {
       System.out.println("@AfterSuite: "+"Genrate report");
     }
     
}
