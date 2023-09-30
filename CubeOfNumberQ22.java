package Assignment1_1;

import java.util.*;


public class CubeOfNumberQ22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n: ");
		int n = sc.nextInt();
		System.out.println("Cubes of the integers are: ");
		for(int i=1; i<=n; i++)
			System.out.println(+(i*i*i));
	}	


}
