package corejaava;
import java.util.*;

public class egg {

	public static void main(String[] args) {
		System.out.println("Welcome to the Egg Market");
		System.out.println("Enter the no of eggs:");
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		int c=a/12;
		int d=a%12;
		System.out.println("You have ordered "+c+" dozen and "+d+" eggs");
		System.out.println("1 egg price is 6 Rupees");
		float n=a*6;
		if(c<2)
		{
			System.out.println("Ypur egg  price is "+a*6);
		}
		else if(c>=2&&c<5)
		{
			System.out.println(" your egg price  after 2% discount is"+(a*6-n*2/100));
			
		}
		else if(c>=5&&c<10)
		{
			System.out.println(" your egg price  after 2% discount is"+((a*6)-(n*5/100)));
			
		}
		else
		{
			System.out.println(" your egg price  after 2% discount is"+((a*6)-(n*12/100)));
			
		}

		

		

	}

}
