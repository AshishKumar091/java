package corejaava;
import java.util.Scanner;

public class temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temp in fahrenheit ");
		float f=sc.nextFloat();
		float c=(f-32)*5/9;
		System.out.println("After converting temp into celcius is "+c);
		
		

	}

}
