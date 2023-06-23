package corejaava;
import java.util.*;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int m=sc.nextInt();
		int n=m;
		int a;
		 int sum=0;
		
		  while(n>0)
		  {   int f=1;
			  a=n%10; 
			  n=n/10;
			   for(int i=1;i<=a;i++)
			   {
				   f=f*i;
			   }
			   sum=sum+f;
			   
		  }
		  
		  if(sum==m)
		  {
			  System.out.println("Strong number");
		  }
		  else {
			  System.out.println("no");
		  }

	}

}
