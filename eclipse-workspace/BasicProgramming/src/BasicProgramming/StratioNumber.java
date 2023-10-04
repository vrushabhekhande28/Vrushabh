package BasicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class StratioNumber 
{
    public static void main(String[] args) 
    {
    	 Scanner sc=new Scanner(System.in);
    	   int num=sc.nextInt();
    	   int multi=num*2;
    	   
    	  String d=""+num;
    	  char [] a=d.toCharArray();
    	  System.out.println(Arrays.toString(a));
    	  
    	  if(a.length>=3)
    	  {
    		 int aa=a[1]-'0';
    		 int aa1=a[2]-'0';
    		 
    		 if(aa==aa1)
    		 {
    			 System.out.println("Starionumber");
    			 
    		 }
    		 else
    		 {
    			 System.out.println("Not Starion Number");
    		 }
    		
    	  }
  
}}
