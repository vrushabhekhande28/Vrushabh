
package Test;

import org.testng.annotations.Test;

// testng execute 2 way
//right click run AS
//right click select testng and click on create testng and 
//file created in yoor maven project as testng.xml and click on that and run 
//if you want to run multilple classes then in the batch execution then select package and then 
//do testng and convert and after genrating and click on testng.xml and run

public class Data 
{
   @Test
   public void editAccount()
   {
	   System.out.println("editAccount");
   }
}
