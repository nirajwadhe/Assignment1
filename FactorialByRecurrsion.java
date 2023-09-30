package Assignment1_1;

import java.util.*;


public class FactorialByRecurrsion{
		int facto( int n ) {
	    if (n != 0)  
	        return n * facto(n-1); 
	    else
	        return 1;
	    }
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			FactorialByRecurrsion f = new FactorialByRecurrsion();
			System.out.println("Factorial of"+n+" is: "+f.facto(n));
		}
}

