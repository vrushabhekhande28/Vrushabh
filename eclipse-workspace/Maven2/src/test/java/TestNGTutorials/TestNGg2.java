package TestNGTutorials;

import org.testng.annotations.Test;


/*
 * here depends on mean id on which method is depend is getting failed then testng  will not
 * exrecute other method
 */


//here result is==>1 failed 3 skipped
public class TestNGg2 
{
   @Test
   public void Test1()
   {
	   int f=10/0;
	 System.out.println("Test1");
   }
   
   @Test(dependsOnMethods="Test1")
   public void Test2()
   {
	 System.out.println("Test2");   
   }
   
   @Test(dependsOnMethods="Test1")
   public void Test3()
   {
	 System.out.println("Test4");
	
   }
   
   @Test(dependsOnMethods="Test1")
   public void Test4()
   {
	 System.out.println("Test4");   
   }
 
}
