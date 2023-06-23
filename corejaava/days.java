package corejaava;
import java.util.*;

public class days {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wed");
			
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturady");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default :
			System.out.println("enter a valid choice");
		break;
		}
		

	}

}
