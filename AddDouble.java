package Assignment1_1;

import java.util.*;


public class AddDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two values to be added: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		double sum = (double)n1+n2;
		System.out.println("Sum is: "+sum);
	}


}
