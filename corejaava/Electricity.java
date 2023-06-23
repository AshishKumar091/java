package corejaava;
import java.util.*;

public class Electricity {

	public static void main(String[] args) {
		System.out.println("Enter your reaadings");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		if(a<=50)
		{
			System.out.println("Your bill after 20% surcharge is"+((a*0.50)+(a*0.2)));
		}
		else if(a>50&&a<=150)
		{
			System.out.println("Your bill after 20% surcharge is"+((a*0.75)+(a*0.2)));
		}
		else if(a>150&&a<=250)
		{
			System.out.println("Your bill after 20% surcharge is"+((a*1.20)+(a*0.2)));
		}
		else
		{
			System.out.println("Your bill after 20% surcharge is"+((a*1.50)+(a*0.2)));
		}
		sc.close();

	}

}
