package corejaava;
import java.util.Scanner;
public class circle {

	public static void main(String[] args) {
	 System.out.println("Enter the radius of circle");
	 Scanner sc=new Scanner(System.in);
	 int r=sc.nextInt();
	 System.out.println("Diameter is "+2*r+" area of circle is"+3.14*r*r+"  Circumference is "+2*3.14*r);
	 sc.close();

	}

}
