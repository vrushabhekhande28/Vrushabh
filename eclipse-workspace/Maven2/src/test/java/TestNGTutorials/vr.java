package TestNGTutorials;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class vr
{
	@Test
	public void ecel() 
	{
		try 
		{
	  String d="C:\\Users\\Asus\\Downloads\\JOB RESUME\\Book1.xlsx";
	  FileOutputStream file=new FileOutputStream(d);
	  file.close();}
		catch(Exception ae)
		{
			ae.getStackTrace();
		}
	}
	  
	  
}
