package Assignment1_1;

import java.util.*;


public class TypeCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in float: ");
		float a = sc.nextFloat();
		System.out.println("Enter the value in int: ");
		int b = sc.nextInt();
		int res = (int)a;
		float res1 = (float)b;
		System.out.println("Conversion from int to float: "+res);
		System.out.println("Conversion from float to int: "+res1);		
	}


}

