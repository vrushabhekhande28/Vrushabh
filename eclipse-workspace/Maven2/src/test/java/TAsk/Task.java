package TAsk;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task 
{
	WebDriver driver;
	ChromeOptions  option=new ChromeOptions();
	
	@BeforeTest
	public void test()
	{
		option.addArguments("remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.get("https://www.noon.com/");
		
	}
	
	@Test
	public void test1()  
	{
		
		
		
		
			
	
		
		/* 
	    List<WebElement> we=   driver.findElements(By.xpath("//div[@class=\"sc-papXJ gHpQDD\"]/div/div"));
	      for(WebElement we1:we)
	      {
	    	  String s=we1.getText();
	    	  System.out.println(s);
	    	  
	    	  
	      }
	      
	    	  
	    */
	    
	}
	
	
	
}
