package corejaava;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a noo");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int a,re=0;
		while(r!=0)
		{
			a=r%10;
			r=r/10;
			re=re*10+a;
			
		}
		System.out.println("Reverse of no is "+ re);

	}

}
