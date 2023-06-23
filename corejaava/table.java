package corejaava;
import java.util.*;

public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		int s=sc.nextInt();
		int e=sc.nextInt();
        int i,j;
		
		for(i=s;i<=e;i++)
		{ 
			 for(j=1;j<=10;j++)
			 {
			    System.out.println(i+"*"+j+"="+j*i);
			 }
			
		}

	}

}

