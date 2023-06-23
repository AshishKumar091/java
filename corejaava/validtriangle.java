package corejaava;
import java.util.*;
public class validtriangle {

	public static void main(String[] args) {
		System.out.print("Enter the ang;es of triangle");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b+c==180)
		{
			System.out.println("Valid triangle");
		}
		else
		{
			System.out.print("Invalid triangle");
		}

	}

}
