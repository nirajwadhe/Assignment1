package Assignment1_1;

import java.util.*;


public class VowelConsQ32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your character: ");
		char ch = sc.next().charAt(0);


		if (ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println("The character '"+ch+"' is a vowel");
		else
			System.out.println("The character '"+ch+"' is a consonent");


	}


}