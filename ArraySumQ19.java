package Assignment1_1;

import java.util.*;


public class ArraySumQ19 {
	
	ArraySumQ19(){
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the "+n+ " values: ");
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of the entered values are: "+sum);
	}


	public static void main(String args[]) {
		
		ArraySumQ19 as = new ArraySumQ19();
		
		/*int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
int arr[] = new int[n];
		System.out.println("Enter the numbers: ");
		for(int i = 0; i<n; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of the entered values are: "+sum);
			*/
	}


}
