package BasicProgramming;

import java.util.Scanner;

public class NthPrime
{
  public static void main(String[] args) 
  {
     int a=Integer.MAX_VALUE;
     System.out.println(a);
     
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int l=0;
     int enter=0;
     for(int i=2 ; i<a ; i++)
     {
    	 int k=0;
    	 for(int ii=2 ; ii<=i ; ii++)
    	 {
    		 if(i%ii==0)
    		 {
    			 k++;
    		 }
    	 }
    	
    	 if(k<=1)
    	 { System.out.println(i);
    		 l++;
    	 }
    	 if(l==num)
    	 {
    		System.out.println(num+"prime number is:"+i);
    		break;
    	 }
     }
    	 
  }
}

