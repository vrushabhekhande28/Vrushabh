package BasicProgramming;

import java.util.Scanner;

public class autoBiogra 
{
  //21200  ==>2+1+2+0+0=5 and count =5   yes autobiographical
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int numsqu=sc.nextInt();
		  int sum=0;
		  int rem;
		  int k=0;
		  while(numsqu>0)
		  {
			  rem=numsqu%10;
			  sum=sum+rem;
			  k++;
			  numsqu=numsqu/10;		  
		  }
		  System.out.println((k==sum)?"Yes Neon AutoBiographical number ":"Not an autobo.gggg number");	
	}
}
