package corejaava;
import java.util.*;

public class perfect {

	public static void main(String[] args) {
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,p=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{   System.out.println("Factor of "+n+" are :"+i);
				p=p+i;
			}
		}
		if(p==n)
		{
			System.out.println("Perfect no");
		}
		else
		{
			System.out.println("No perfect no");
		}
		
	}

}
