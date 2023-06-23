package corejaava;
import java.util.*;
public class payroll {
	public static void main(String[] args) {
		System.out.println("Enter the no of hour worked by the worker and the hourly pay rate ");
		Scanner sc=new Scanner(System.in);
		int h =sc.nextInt();
		int r=sc.nextInt();
		float g;
		g=h*r*15/100;
		System.out.println("Worker salary before grosspay is"+ h*r);
		System.out.println("Worker finally salary after 15% gross pay is "+ (h*r-g));
		
		
	}
	

}
