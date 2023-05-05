package TAsk;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;


public class Vrushah 
{
	public void tes()
	{
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     
     String s=""+num;
     char[] c=s.toCharArray();
     Arrays.sort(c);
     System.out.println(c.toString());
     
	}
}
