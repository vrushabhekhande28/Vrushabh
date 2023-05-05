package Mock;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Mock1 
{
	WebDriver driver;
	@Test(priority=1)
   public void lauch()
   {
	     ChromeOptions option=new ChromeOptions();
		  option.addArguments("--remote-allow-origins=*");
		 driver =new ChromeDriver(option);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://letcode.in/signup");
		 
   }
	
	@Test(priority=2)
	public void signup()
	{
		//System.out.println("enter gmail");
		//Scanner sc=new Scanner(System.in);
		//String d=sc.next();
		
		LocalDateTime t=LocalDateTime.now();
		String ds=t.toString();
		ds=ds.replace(":", "-");
		
		driver.findElement(By.id("name")).sendKeys("Vrushabh Ekhande");
		WebElement we=driver.findElement(By.id("email"));
		we.sendKeys("Vrushabhense8@"+ds+"gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Vrushabh@27");;
		driver.findElement(By.xpath("//button[text()='SIGN UP']")).click();
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	
	}
   
	@Test(priority=3)
	public void ExploreThings()
	{
	  driver.findElement(By.xpath("//a[text()='Explore Workspace']")).click();
	  
	  
	}
	
	
	@Test(priority=4)
	public void Input()
	{
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		Boolean b=driver.findElement(By.id("fullName")).isEnabled();
		System.out.println("Enter your full name text feild is enableed:"+b);
		driver.navigate().back();
	}
	
	@Test(priority=5)
	public void TextValue()
	{
	    driver.findElement(By.xpath("//a[text()='Click']")).click();
	    WebElement we=driver.findElement(By.xpath("//button[@id=\"position\"]"));
	    Dimension d=we.getSize();
	    System.out.println("Height of button is:"+d.getHeight());
	    System.out.println("Width of button is:"+d.getWidth());
	      
	}
	
	@Test(priority=6)
	public void logout() throws InterruptedException
	{
		Thread.sleep(10);
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	}
	
	

}
