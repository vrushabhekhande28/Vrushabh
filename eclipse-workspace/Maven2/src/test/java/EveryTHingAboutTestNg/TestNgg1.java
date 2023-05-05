
package EveryTHingAboutTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgg1
{
   @BeforeSuite
   public void testScript1()
   {
	System.out.println("BeforeSuite");   
   }
   
   @BeforeTest
   public void testScript2()
   {
		System.out.println("BeforeTest");  
   }
   
   @BeforeClass
   public void testScript3()
   {
		System.out.println("beforeClass");  
   }
   
   
   //before test should execute overtime before and after every method
   @BeforeMethod
   public void testScript4()
   {
	   System.out.println("BeforeMethod");
   }
   
   @Test
   public void testScript6()
   {
		System.out.println("Test2");  
   }
   
   
   @Test
   public void testScript()
   {
		System.out.println("Test2");  
   }
  
   
   
   @AfterMethod
   public void testScript7()
   {
	   System.out.println("BeforeMethod");
   }
   
  
   
   @AfterClass
   public void testScript8()
   {
		System.out.println("Afterclass");  
   }
   
   @AfterTest
   public void testScript9()
   {
		System.out.println("After Test");  
   }
   
   @AfterSuite
   public void testScript10()
   {
		System.out.println("AfterSuite");     
   }
}
