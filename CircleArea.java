package Assignment1_1;

import java.util.*;


public class CircleArea {
	public static void main(String[] args) {
		float pi = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius of circle: ");
		float rad = sc.nextFloat();
		float area = pi * rad * rad;
		System.out.println("Area of cicle is: " +area);
	} 
}
