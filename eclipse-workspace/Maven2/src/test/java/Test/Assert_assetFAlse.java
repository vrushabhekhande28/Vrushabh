package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assetFAlse 
{
	@Test
	 public void acti()
	    {
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
		  WebElement We= driver.findElement(By.id("keepLoggedInCheckBox"));
	    	//Assert.assertTrue(We.isSelected());
	    //	Assert.assertFalse(We.isEnabled());
	    	
	    	//if condition are true gives exception or 
	    	// if conditions are getting false then it will get executed
	    	//it is exactly opposite to the a  assert.true condition
	    	
	    	System.out.println("conditions satisfied");
	    }
}
