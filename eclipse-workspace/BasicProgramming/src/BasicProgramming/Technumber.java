package BasicProgramming;

import java.util.Scanner;

public class Technumber 
{
  //2025  ==> 20+25 ==> 45sqr==>2025    if(2025==2-15
	
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    
	    String s=""+num;
	    
char [] c=s.toCharArray();

if(c.length %2==0)
{
	   int k=c.length/2;
	   String a="";
	   String b="";
	   
	  for(int i=0 ; i<c.length ; i++)
	   {
		  if(i<k)
		   a=a+c[i];
		  else
		  b=b+c[i];
	   }
	  
	  int a1=Integer.parseInt(a);
	  int b1=Integer.parseInt(b);
	  
	  System.out.println(a1);
	  System.out.println(b1);
	  
	  int c1=a1+b1;
	  
	  if((c1*c1)==num)
	  {
		  System.out.println("Tech number");
	  }
	  else
	  {
		  System.out.println("Not an Tech number");
	  }
  }
       
	}
}
       