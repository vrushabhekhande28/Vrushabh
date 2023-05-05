package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertTrue
{
	@Test
	 public void acti()
	    {
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://demo.actitime.com/login.do");
		  WebElement We= driver.findElement(By.id("keepLoggedInCheckBox"));
	    	Assert.assertTrue(We.isSelected());
	    	Assert.assertTrue(We.isEnabled());
	    	
	    	System.out.println("conditions satisfied");
	    }
	    
	   
}
