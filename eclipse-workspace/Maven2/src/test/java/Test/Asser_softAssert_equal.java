
package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asser_softAssert_equal
{
	SoftAssert soft=new SoftAssert();
	
   @Test
   public void acti()
   {
	  soft.assertEquals("punr", "mumai");   
	  //here we just any values it true-true or true-false output we will getootput testcase passed
	  //to avoid this we apply assert.all method
	  soft.assertAll();
   }
   
   
   @Test
   public void facebook()
   {
	  soft.assertEquals("pune", "pune");   
	  //here we just any values it true-true or true-false output we will getootput testcase passed
	  //to avoid this we apply assert.all method
	  soft.assertAll();
   }
   
   //here if 1st test case failesd if we use that object for another test then output we will get failed even test case is getting passed
   //so to avoid  this you need  to create new Object of SoftAssert
   
    
      
}
