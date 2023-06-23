package corejaava;
import java.util.*;

public class divisible {

	public static void main(String[] args) {
		System.out.println("Program to check wheather aa no is divide by 5 or 11");
		System.out.println("Enter a no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%5==0 && a%11==0)
		{
			System.out.println("Yes ");
		}
		else
		{
			System.out.println("no");
		}
		

	}

}
