package corejaava;
import java.util.*;

public class calculator {

	public static void main(String[] args) {
		System.out.println("Enter two  no");
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=sc.nextFloat();
		System.out.println("Enter your choice from this  + for add, * for mul, / for div , - for sub , % for remainder");
		String c = sc.next();
		switch(c)
		{
		case "+" -> {System.out.println(a+b); System.out.println("Hello");}// no break keyword required
	    case "*" ->System.out.println(a*b);
        case "/" -> System.out.println(a/b);
        case "-" ->System.out.println(a-b); 
        case "%"->System.out.println(a%b);
	    default ->System.out.println("Enter a valid choice");
		}
		sc.close();


	}

}
