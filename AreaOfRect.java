package Assignment1_1;


import java.util.Scanner;


public class AreaOfRect {
	public static float rect(float l, float b) {
		float area = l*b;
		return area;
	}
	
	public static float tri(float b, float h) {
		float area = (b*h)/2;
		return area;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1) To calculate area of triangle");
		System.out.println("2) To calculate area of rectangle");
		System.out.println("Enter your choice: ");
		int opt=sc.nextInt();
		
		switch(opt) {
case 1: System.out.println("Area of triangle calculation!");
			System.out.println("Enter base: ");
			float b=sc.nextInt();
			System.out.println("Enter height: ");
			float h=sc.nextInt();
			float result = AreaOfRect.tri(b, h);
			System.out.println("Area is: "+result);
			break;
			
		case 2: System.out.println("Area of rectangle calculation!"); 
			System.out.println("Enter breadth: ");
			b=sc.nextInt();
			System.out.println("Enter length: ");
			float l=sc.nextInt();
			float result1 = AreaOfRect.rect(l, b);
			System.out.println("Area is: "+result1);
			break;
		default:
			System.out.println("Invalid choice!");
			break;
		}
				
	}
}
