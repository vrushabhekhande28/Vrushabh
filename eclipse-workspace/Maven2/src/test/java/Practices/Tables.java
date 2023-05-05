package Practices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tables
{
	ChromeOptions option;
	WebDriver driver;
   @BeforeTest
   public void setUp()
   {
	    option=new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
   }
   
   @FindBy (css="img[alt=\"company-branding\"]")
   WebElement  orangehrmLogo; 
   
   @FindBy (name="username")
   WebElement username;
   
   @FindBy(name="password")
   WebElement password;
   
   @FindBy(css="button[type=\"submit\"]")
   WebElement submit;
   
   Tables()
   {
	   PageFactory.initElements(driver, this);
   }

   @Test
   public void r()
   {
	  
	   username.sendKeys("jjj");
	   
   }
   
}
