package BasicProgramming;

import java.util.Scanner;

public class AutomographicNumberPrograme 
{
   //we 25 square 625 it contain acual number
	//we 76 square 5776 it contains 76 last 
	
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number");
	   int num=sc.nextInt();
	   int numsqu=(int) Math.pow(num, 2);
	   System.out.println("Suare of enter number is: "+numsqu);
	   int rem;
	   int rem1;
	   int rev=0;
	   int rev1=0;
	   int l=0;
	   
	    while(num>0 && numsqu>0)
	    {
	    	 rem=num%10;
	    	 rem1=numsqu%10;
	    	  
	    	 int k=0;
	    	 if(rem1==rem)
	    	 {
	    		 System.out.println(rem+""+rem1); 
	    	 }
	    	 else
	    	 {
	    		 System.out.println("numer is not automarphic");
	    		 return;
	    	 }
	    	 
	    	 num=num/10;
	    	 numsqu=numsqu/10;
	    }
	    System.out.println("Yes number is automarphic");
	}
	
}
