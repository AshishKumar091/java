package corejaava;
import java.util.*;

public class feess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no of hours in which you study");
		System.out.println("Enter the amount of book");
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The extra amount for athletic fees is 65");
				
		System.out.println("the total fees is"+(a*85+b+65));

	}

}
