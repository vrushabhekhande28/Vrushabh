package BasicProgramming;

import java.util.Scanner;

public class SpyNUm 
{
   //1234 ==> 1 2 3 4 ==>1*2*3*4 ==>24  and 1+@+3+4==>10  if(product == sum) then spy	
	public static void main(String [] args) {
   Scanner sc=new Scanner(System.in);
   int numsqu=sc.nextInt();
   
      int sum=0;
      int prod=1;
	  int rem;
	  while(numsqu>0)
	  {
		  rem=numsqu%10;
		  sum=sum+rem;
		  prod=prod*rem;
		  
		  numsqu=numsqu/10;		  
	  }
	  
	  if(prod==sum)
	  {
		  System.out.println("Spy NUmber");
	  }
	  else
	  {
		  System.out.println("not Spy number");
	  }
	}
}
