package TestPractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class prac 
{
	@BeforeTest(groups="1")
	public void beforeTest()
	{
		System.out.println("before test");
	}
	
	@BeforeClass 
	public void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	

	@Test (groups="1")
	public void test2()
	{
		System.out.println("Test2");
	}
	
	@AfterMethod (groups="1")
	public void afterMethod()
	{
		System.out.println("After method");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest() 
	{
		System.out.println("Aftre test");
	}
	
	@AfterSuite
	public void afterSu()
	{
	  System.out.println("After suite");
	}
	

}
