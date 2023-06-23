package corejaava;
import java.util.*;

public class balane {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" press 1 for checking account balance \n press 2 for saving account balance");
		int a=sc.nextInt();
		System.out.println("ENter the balane for checking accouunt ");
		int b=sc.nextInt();
		System.out.println("Enter the balance for saving account");
		
		int c=sc.nextInt();
		switch(a)
		{
		case 1:
			 if(b<10)
			 {
				 System.out.println("Checking amount balance is low");
			 }
			 else
			 {
				 System.out.println("Balance is normal of chhecking account balance");
			 }
			break;
		case 2:
			if(c<100)
			{
				System.out.println("Saving account balance is less than 100");
			}
			else
			{
				System.out.println("Savinng account balance is normal");
			}
			break;
			default :
				System.out.println("Enter a valid choice");
				break;
		}

	}

}
