package corejaava;
import java.util.*;

public class triangle {
	
	

	public static void main(String[] args) {
		System.out.println("Enter the sides of triangle:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if((a==b&&a!=c)||(b==c&&b!=a)||(c==a&&c!=b)) 
		{
			System.out.println("Isocles triangle");
		}
		else if(a==b&&b==c) {
			System.out.println("Equilateral triangle");
		 
		}
		else
		
        	 System.out.println("Scalene triangle");
	}

}
