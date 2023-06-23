package corejaava;
import java.util.*;

public class TicketNumber {

	public static void main(String[] args) {
		System.out.println("Enter your ticket number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=a%10;
		int b=a/10;
		int c=b%7;
		
		
		   System.out.println("The last digit of your ticket no is:" + n);
		   System.out.println("When your ticket is of five digit then after dividing it by 7 Remainder is "+c);
		   if(c==n)
		     {
			   System.out.println("MESSAGE BOX--> Your ticket is valid");
	        	}
		   else
		   {
			   System.out.print("MESSAGE BOX--> Your ticket is invalid");
		   }
		
		   sc.close();
		
		

	}

}
