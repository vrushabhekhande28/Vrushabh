package BasicProgramming;

import java.util.Scanner;

public class MInToSec{
   static  Scanner sc=new Scanner(System.in);
   public static void main(String[] args) 
   {
	   System.out.println("Enter min to convert to hrs");
	   int min=sc.nextInt();
	   minToHrs(min);
	   
	   System.out.println("Enter hrs to convert in seconds");
	   int sec=sc.nextInt();
	   hrsTOSec(sec);
	   
	   System.out.println("Enter meterSquare to convert centimeter square to ");
	   int meterSquare=sc.nextInt();   
	   SquareMeterToCentimeterSquare(meterSquare);
	   
	   System.out.println("Entervalue to convert mb to kb");
	   int mb=sc.nextInt();
	   mbTOkb(mb);
	   
	   System.out.println("Enter value to convert feet to cm");
	   int num=sc.nextInt();
	   feetToCm(num);
	   
	   System.out.println("Enter value to convert kg to gm");
	   int kg=sc.nextInt();
	   kmTogm(kg);
	   
	   
	   System.out.println("Enter a number to convert cel to farehite");
	   int cls=sc.nextInt();
	   clsToFar(cls);
	   
	   System.out.println("Enter a number to get factors of that number");
	   int nu=sc.nextInt();
	   factors(nu);
	   
	   System.out.println("Enter a num to get sum of its num");
	   int su=sc.nextInt();
	   sum(su);
	   
	   System.out.println("Enter number to check factors count  of that num");
	   int n=sc.nextInt();
	   countFactor(n);
	   
	   System.out.println("Enter a number to print sum of its factor");
	   int f=sc.nextInt();
	   facSum(f);
	   
	   System.out.println("enter a number to find even number in that number");
	   int numm=sc.nextInt();
	   findEven(numm);
	   
	   System.out.println("Enter a number to check all numbers are even ");
	   int num1=sc.nextInt();
	   checkAllNumberAreEven(num1);
	   
	    System.out.println("Enter a number is divisbile by 5 and 3");
	    int num2=sc.nextInt();
	    divide(num);
	    
	     System.out.println("Enter a m and n to check even number between them");
	     int m=sc.nextInt();
	     int n1=sc.nextInt(m);
	     checkEven(m,n1);
	     checkodd(m,n1);
	     checkEvenSum(m,n1);
	     checkOddSum(m,n1);
	     
	     System.out.println("Enter a number to reverse number:");
	     int ss=sc.nextInt();
	     reverse(ss);
	     
	     
	     System.out.println("Enter a char m and n to check vowels ");
	     char m2=sc.next().charAt(0);
	     char n2=sc.next().charAt(0);
	     vowels(m2,n2);
	     con(m2,n2);
	     
	     
	     
	   
	     
	     
	     
	     
	     
	     
  }
   
   
   public static void minToHrs(int min)
   {
   int a=min%60;
   int b=min/60;
   System.out.println(b+"hrs and"+a+"minutes");
   }
   
   public static void hrsTOSec(int min)
   {
	   System.out.println(min+"Min : "+min*60+" seconds");
   }
   
   public static void SquareMeterToCentimeterSquare(int square)
   {
	   System.out.println(square+"Square meter  : "+square*10000+"centimeter");   
   }
   
   public static void mbTOkb(int mb)
   {
	   System.out.println(mb+"mb : "+mb*1000+"kb");
   }
   
   public static void feetToCm(int feet)
   {
	   System.out.println(feet+"feet:"+feet*30.47);
   }
   
   public static void kmTogm(int kg)
   {
	   System.out.println(kg+"feet:"+kg*1000+"gm");
   }
   
   public static void clsToFar(int cls)
   {
	   System.out.println(cls+"cls :"+cls*23+"far");
   }
   
   public static void factors(int num)
   {
	   System.out.println("factors of "+num+": ");
	    for(int i=1 ; i<=num ; i++)
	    {
	    	 if(num%i==0)
	    		 System.out.print(num);
	    	 if(num>i)
	    		 System.out.print(",");
	    	 else
	    		 System.out.print(".");
	    }
   }
   
   
   public static void sum(int num)
   {
	   int rem;
	   int rev=0;
	     while(num>0)
	     {
	    	 rem=num%10;     
	    	 rev=rev*10+rem; 
	    	 num=num/10;     
	     }
	    	 
   }
   
   
   
   public static void countFactor(int num)
   {
	
	   int k=0;
	    for(int i=1 ; i<=num ; i++)
	    {
	    	 if(num%i==0)
	    		  k++;
	    		    }
	    System.out.println("factors are: "+k);
   }
   
   
   public static void facSum(int num)
   {
	
	   int k=0;
	    for(int i=1 ; i<=num ; i++)
	    {
	    	 if(num%i==0)
	    		  k=k+i;
	    		    }
	    System.out.println("factors sum : "+k);
   }
   
   
   public static void findEven(int num)
   {
	   int rem;
	    while(num>0)
	    {
	    	 rem=num%10;
	    	 if(num%2==0)
	    	 {
	    		 System.out.print(num);
	    	 }
	    	 num=num/10;
	    }
	   
   }
   
  
   
   public static void checkAllNumberAreEven(int num)
   {
	   int rem;
	    while(num>0)
	    {
	    	 rem=num%10;
	    	 if(num%2!=0)
	    	 {
	    		 break;
	    	 }
	    	
	    }   
	    System.out.println("All numbers are even");
   }
   
   
   public static void divide(int num)
   {
	   if(num%5==0 && num%3==0)
	   {
		   System.out.println(num);
	   }
   }
   
   public static void checkEven(int m ,int n)
   {
	     for(int i=m ;i<=n ; i++)
	     {
	    	 if(i%2==0)
	    	 {
	    		 System.out.println(i);
	    	 }
	     }
	    	 
   }
   
   public static void checkodd(int m ,int n)
   {
	     for(int i=m ;i<=n ; i++)
	     {
	    	 if(i%2!=0)
	    	 {
	    		 System.out.println(i);
	    	 }
	     }
	    	 
   }
   
   public static void checkEvenSum(int m ,int n)
   {
	   int a=0;
	     for(int i=m ;i<=n ; i++)
	     {
	    	 if(i%2==0)
	    	 {
	    		 a=a+i;
	    	 }
	     }
	     System.out.println("sum of even is :"+a);
	    	 
   }
   
   public static void checkOddSum(int m ,int n)
   {
	   int a=0;
	     for(int i=m ;i<=n ; i++)
	     {
	    	 if(i%2!=0)
	    	 {
	    		 a=a+i;
	    	 }
	     }
	     System.out.println("sum of odd is :"+a);
	    	 
   }
   
   public static void reverse(int num)
   {
	   int rem;
	   int rev=0;
	     while(num>0)
	     {
	    	 rem=num%10;       //110 ==>11
	    	 rev=rev*10+rem;   //11
	    	 num=num/10;       //1
	     }
	     
	     System.out.println("reverse number is:"+rev);
   }
   
   public static void vowels(char m,char n)
   {
	  for(char a=m ; a<n ;a++ )
	  {
		  if(a=='a' || a=='e'|| a=='i' || a=='o' || a=='u')
		  {
			  System.out.println(a);
		  }
	  }
   }
   
   public static void con(char m,char n)
   {
	  for(char a=m ; a<n ;a++ )
	  {
		  if(a!='a' || a!='e'|| a!='i' || a!='o' || a!='u')
		  {
			  System.out.println(a);
		  }
	  }
   }
   
}

