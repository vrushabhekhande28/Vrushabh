package BasicProgramming;

import java.util.Scanner;

public class Krishnmurthi
{
  public static void main(String[] args) 
  {
	 
	  
	  /*
	     145
	     1 =1
	     4=1*2*3*4
	     5=1*2*3*4*5
	     
	     1+24+120==145
	     
	     if(145==145) krish
	       
	   
	   */
	  
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number");
	   int num=sc.nextInt();
	   int num1=num;
	   int rem;
	   int rev=0;
	   int sum=1;
	   int sum1 = 0;
	   
	   //55 
	   while(num>0)
	   {
		   rem=num%10;   //5
		   for(int i=1 ; i<=rem ; i++)
		   {
			  sum=sum*i;
		   }
		   
		  
		   sum1=sum1+sum;
		   sum=1;
		   num=num/10;
	   }
	   
	   
	  if(num1==sum1)
	  {
		  System.out.println("krishnmurthi");
	  }
	  else
	  {
		  System.out.println("Not Krishmurthi");
	  }

  }
}
