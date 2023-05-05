package Flipkart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main 
{
  public static void main(String[] args) throws InterruptedException 
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--remote-allow-origins=*");
	  WebDriver driver=new ChromeDriver(option);
	  WebElemen we=new WebElemen(driver);
	  we.Setup();
	  we.url();
	  we.softLoginWindowclick();
	  we.enetreproduct("realme 5pro");
	  we.selectRam();
	  String f=we.selectPhone();
	  we.SwitchToWindow(f);
	  we.checkNotifyOptionIsThere();
	  
	  
	
}
}
