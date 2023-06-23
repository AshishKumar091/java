package corejaava;
import java.util.*;

public class positive {

	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0)
		{
			 System.out.println("Entered no is 0");
		}
		else if(a>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
		

	}

}
