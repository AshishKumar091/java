package corejaava;
import java.util.Scanner;

public class parameter {
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the length and breadth of rectangle");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  System.out.println("Parameter is "+ 2*(a+b)+ " and area is "+a*b);
	  
  }
}
