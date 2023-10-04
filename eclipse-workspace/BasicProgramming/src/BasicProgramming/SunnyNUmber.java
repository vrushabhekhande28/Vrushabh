package BasicProgramming;

import java.util.Scanner;

public class SunnyNUmber
{
  public static void main(String[] args) 
  {
	  Scanner sc=new Scanner(System.in);
	  int num=sc.nextInt();
	  
	  int num1=num+1;
	double a=Math.sqrt(num1);
	System.out.println(a);
	int aa=(int) ((int)a*a); 
	System.out.println(aa);
	
	if(num==aa)
	{
		System.out.println("Sunny number");
	}
	else
	{
		System.out.println("Not sunny number");
	}
  
	  
	  
	  
  }
}
