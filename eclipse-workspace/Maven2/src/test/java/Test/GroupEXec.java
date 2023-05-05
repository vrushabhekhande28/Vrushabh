package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupEXec 
{
@Test (groups="test")
public void create()
{  
	  System.out.println("account executed");
	  Assert.assertEquals(true, false);
}

@Test (groups="test")
public void modiefy()
{
    System.out.println("account modified");
}

@Test(groups="report")
public void delete()  
{
	  System.out.println(("Account deleted"));
}
}



/*
 // you need to put in this way into testng xml file
   <groups>
     <run>
       <include name="test"></include>
       <!--here you can alse right include to exclude dffernce is that you can include considerd same and  -->
     </run>
   </groups>
 * 
*/
