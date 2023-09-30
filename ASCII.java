package Assignment1_1;


import java.util.*;


public class ASCII {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your input: ");
		char in = sc.next().charAt(0);
		
		int result = (int)in;
		System.out.println("ASCII value is: "+result);
	}
}
