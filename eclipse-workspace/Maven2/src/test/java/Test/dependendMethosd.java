package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependendMethosd 
{
	@Test 
public void create()
{  
	  System.out.println("account executed");
	  Assert.assertEquals(true, false);
}

@Test (dependsOnMethods="create")
public void modiefy()
{
    System.out.println("account modified");
}

@Test (dependsOnMethods="modiefy")
public void delete()  
{
	  System.out.println(("Account deleted"));
}

}
