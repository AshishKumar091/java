package corejaava;
import java.util.*;
class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a no:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int re=0;
		int sum=0;
		int r;
		int rm=0;
		while(n!=0)
		{
			r=n%10;
			n=n/10;
			re=re*10+r;
		}
		while(re!=0)
		{  rm=re%10;
		
		    re=re/10;
		   sum=sum+rm;
		   if(re!=0) {
		   System.out.print(rm+"+");
		   }
		   else
		   {
			   System.out.print(rm);
		   }
		}
		 
		System.out.print(" ="+ sum);
				

	}

}
