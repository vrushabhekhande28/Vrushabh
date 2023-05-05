package Test;

import org.testng.Assert;
import org.testng.annotations.Test;


//here types of assertion
//hard and soft assertion
//hard assertion will genrate exception if it get failed to get satisfied 
public class Assert_or_Assertion_or_checkPoint 
{
    @Test
    public void acti()
    {
    	Assert.assertEquals("pune", "guregoan");
    	System.out.println("conditions satisfied");
    }
    
    @Test
    public void facebook()
    {
    	Assert.assertEquals("facebook", "facebook");
    	System.out.println("2nd condition satisfied");
    }
}

//here if one test get failed it only get failed otherwise another test get executed sucessfully
