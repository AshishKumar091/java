package corejaava;

import java.util.Scanner;

public class Searchengine {

	public static void main(String[] args) {
		System.out.println(" Enter top 5 list of player .");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String player[]= new String[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println(" enter at position : "+i);
			player[i]=sc.next();
		}
		System.out.println("Enter the player name to search : ");
		String search = sc.next();
		boolean found=false;
		for(int i = 0;i<n;i++)
		{
			if(search.equalsIgnoreCase(player[i]))
			{
				System.out.println(search+" player found at position "+(i+1));
				found = true;
			}
			
//				else
//				{
//					System.out.println("player not found in top 5");
//				}
		}
		if(!found)
			System.out.println("player not found in top 5");
	}

}

