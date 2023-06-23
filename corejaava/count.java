package corejaava;
import java.util.*;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int c=0;
      while(a!=0)
      {
    	  
    	  a=a/10;
    	  c=c+1;
      }
      System.out.println("no of digits is:"+c);
	}

}
