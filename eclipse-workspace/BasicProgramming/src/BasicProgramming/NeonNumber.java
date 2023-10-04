package BasicProgramming;

import java.util.Scanner;

public class NeonNumber
{
  public static void main(String[] args) 
  {
	//9 ==>81 ==>8+1 ==>9 ===>yes
	 //45 ==2025 ==>2+0+2+5 ==>no
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int num=sc.nextInt();
	  int numsqu=(int)Math.pow(num, 2);
	  int sum=0;
	  int rem;
	  while(numsqu>0)
	  {
		  rem=numsqu%10;
		  sum=sum+rem;
		  numsqu=numsqu/10;		  
	  }
	  System.out.println((sum==num)?"Yes Neon number ":"Not an Neon number");
	  
}
}
