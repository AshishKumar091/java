package corejaava;
import java.util.*;

public class minutes {

	public static void main(String[] args) {
		System.out.println("Enter thr no of minutes  worked by worker");
		Scanner sc=new Scanner (System.in);
		int m=sc.nextInt();
		System.out.println("No of minutes worked by worker is "+m +" minutes");
		int a;
		a=m/60;
		int b;
		b=m%60;
		System.out.println("No of hours worked by worker is "+a+" hour and no  of minutes worked by worker is "+ b+" minutes");
		sc.close();
		
	
	}
}


