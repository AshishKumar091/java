package corejaava;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STRING IS NOT ONLY A COLLECTION OF  CHARACTER OR NOT A GROUP  OF A CHARACTER  BUT  IT IS ALSO A CLASS IN JAVA
		//Immutable  if change cannot be assigned to same memory address (space)
		// string buffer and  string builder
		String s="nishant";
		String s1=new String("Nishant is learning java");
		char[] a= {'a','s','h'};
		String s3=new String(a);
		int a1=10;
		float b=20.6f;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s==s1); 
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s+a1+b);
		System.out.println(a1+b+s);
		System.out.println(a1+s+b);
		System.out.println(s.concat(s1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.length());
		System.out.println(s.startsWith("N"));
		System.out.println(s.endsWith("t"));
		System.out.println(s.charAt(3));      
		System.out.println(s.indexOf("t"));
		System.out.println(s.substring(0,4));
		char c[]=s.toCharArray();
		for(char i:c)
		{ System.out.println(i);
		}
		String[] d = s1.split(" ");
		for(String j:d)
		{
			System.out.println(j);
		}
		
		System.out.println(s1.replace("java", "python"));
				
				
	}
}



 