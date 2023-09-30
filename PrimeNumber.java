package Assignment1_1;

import java.util.Scanner;

public class PrimeNumber {
public static boolean PrimeNo() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number - ");
	int n = sc.nextInt();
	boolean flag = true;
	for (int i = 2 ;i<=n/2;i++) {
		if (n%i==0) {
			flag = false;
			break;
		}
	}
	return flag;
	
}
public static void main(String[] args) {

	if(PrimeNo()) 
	{
		System.out.println("Numner is Prime");
	}
	else {
	System.out.println("Numner is Not Prime");
		}
}
}