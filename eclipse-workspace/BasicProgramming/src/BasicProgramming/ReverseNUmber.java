package BasicProgramming;

import java.util.Scanner;

public class ReverseNUmber 
{
  static Scanner sc=new Scanner(System.in);
 public static void main(String[] args) 
 {
  	 int num=sc.nextInt();//230
  	 int rem;
  	 int rev=0;
  	 
  	 while(num>0)
  	 {  //112
  	    rem=num%10;      //2      //1     //1
  		rev=rev*10+rem;   //2     //21     //210+1==211
  		num=num/10;       //11    //1  
  		
  	 }
  	 
  	 System.out.println(rev);
 }
}
