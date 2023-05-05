package Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asser_soft_true
{
	SoftAssert as=new SoftAssert();
 
    @Test
    public void acti()
    {
    	as.assertTrue(true);
    	System.out.println("Actitime login");
    	as.assertAll();
    	
    }
}
