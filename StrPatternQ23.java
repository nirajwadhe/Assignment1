package Assignment1_1;

import java.util.*;


public class StrPatternQ23 {
	  public static void main(String[] args){
		  int k=1;
	   	  System.out.print("Input number of rows : ");
	   	  Scanner sc = new Scanner(System.in);
		  int n = sc.nextInt();
	   	  for(int i=1;i<=n;i++){
	   		  for(int j=1;j<=i;j++)
	   			  System.out.print(k+++"\t");
	   		  System.out.println(" ");
	   	  }  		
	  }
}
