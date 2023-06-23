package corejaava;
import java.util.Scanner;

public class angle {

	public static void main(String[] args) {
		
     System.out.println("Enter the two sides angle of a triangle");
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=180-a-b;
     System.out.println("Other angle is "+c);
	}

}
