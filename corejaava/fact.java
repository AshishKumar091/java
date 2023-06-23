package corejaava;
import java.util.*;

public class fact {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int f=1;
		System.out.print("Enter a no");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{    
		    f=f*i;
		} 
		System.out.println("factorial is"+f);
		}
	

	}


