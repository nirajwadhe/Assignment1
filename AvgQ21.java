package Assignment1_1;

import java.util.*;


public class AvgQ21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 numbers");
		float n1 = sc.nextInt();
		float n2 = sc.nextInt();
		float n3 = sc.nextInt();
		float n4 = sc.nextInt();
		float n5 = sc.nextInt();
		System.out.println("Average of the numbers is: "+((n1+n2+n3+n4+n5)/2));
		System.out.println("Sum of the numbers is: "+(n1+n2+n3+n4+n5));
	}
}
