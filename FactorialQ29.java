package Assignment1_1;

import java.util.*;


public class FactorialQ29 {
	public static void main(String args[]) {
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+n+" numbers is: "+fact);
	}
}
