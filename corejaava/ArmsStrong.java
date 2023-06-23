package corejaava;
import java.util.*;

public class ArmsStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int r=0,s,c=100;
	
		for(int j=1;j<=c;j++)
		{
			int m=j;
		   for(int i=1;i<j;i++)
		   {
			s=j%10;
			j=j/10;
			r=r+s;
		  }
		    if(m==j)
		  {
			System.out.println("Armstrong no"+m);
	     	}
	    	}
	//	else
		//{
			//System.out.println("Not a armostrong no");
		//}
		sc.close();
		
		
		
		

	}

}
