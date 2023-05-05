package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotationss
{
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	@BeforeClass
	public void Bc()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void Bm()
	{
		  System.out.println("Login");
	}
	 
    @Test
    public void createAccount()
    {
    	System.out.println("createAccount");
    }
    
    @AfterMethod
    public void AM()
    {
       System.out.println("Logout");	
    }
    
    @Test
    public void modify()
    {
    	System.out.println("Modification");
    }
    
    @AfterClass()
    public void AC()
    {
    	System.out.println("Ac");
    }
    
    @AfterTest
    public void AfterTest()
	{
		System.out.println("After Test");
	}
    
    @AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite");
	}
}




/*
//this is for single class this flow will change if we run multiple classes at different way if we use before and after suite flow will get ,maintained as we write following below waysbs 
bs 
  bt
    bc
      bm
        test
      am
    ac
  at 
as 
 */


/*
  before method execute every time before the test and same after method xecute after method everytine
  before and after class execute only once before start and before end
   before and after test  vrus execute only once before start and before end
  
 */
