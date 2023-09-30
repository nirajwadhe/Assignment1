package Assignment1_1;

import java.util.*;


public class DecToBin {
	public static void main(String args[]) {
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value:");
		int dec = sc.nextInt();
		int binary[] = new int[100];
		while(dec!=0) {
			binary[i]=dec%2;
			dec=dec/2;
			i++;
		}
		System.out.println("The binary value of "+dec+" is:");
		for(int j=i-1;j>=0;j--) {
			System.out.print(binary[j]);
		}
		
	}
}
