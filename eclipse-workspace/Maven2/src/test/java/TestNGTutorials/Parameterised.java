package TestNGTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//Data drivern testing 
//approcah1-==>  by using an   testng.xml file configurations


public class Parameterised 
{
	  ChromeOptions option=new ChromeOptions();
      WebDriver driver;
      
      @Parameters({"browser","url","element1","element2"})
      @Test
      public void Make(String browser,String url ,String element1, String element2)
      { 
    	    option.addArguments("remote-allow-origins=*");
    	    driver=new ChromeDriver(option);
    	    driver.get(url);
    	    System.out.println(url);
    	    System.out.println(element1);
    	    System.out.println(element2);
      }
}




/*

 //for the configration in testing-xml

<suite name="Suite">
  <test thread-count="5" name="Test">
  <parameter name="url" value="https://letcode.in/edit"></parameter>
<parameter name="element1" value="vrushabh"></parameter>
<parameter name="element2" value="vrushabh"></parameter>
  <classes><class name="TestNGTutorials.Parameterised"></class></classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
 */
