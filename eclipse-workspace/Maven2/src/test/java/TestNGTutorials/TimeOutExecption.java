package TestNGTutorials;

import org.testng.annotations.Test;

//interviewQuestion

//how would you manage execption in testng
//==> by following way
//==> by expectedExecption=kkkk.class


//here you can handdle by expectdException=

//timeout==>  after given time method is getting termenated
///*
public class TimeOutExecption 
{
/*
@Test(timeOut=2,expectedExceptions=StackOverflowError.class)
public void infiniteLoop()
{
	int h=1;
	while(h==1)
	{
		System.out.println("ok print it infinite");
	}
}
*/


@Test(expectedExceptions=NumberFormatException.class)
	public void test()

	{
	     String f="101l";
	     int j=Integer.parseInt(f);
	     System.out.println(j);
	     
	}

}
