package pckg;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MortGage {

	 public static void main(String[] args) {
		   
		  Scanner scan = new Scanner(System.in);
		  
		  
		  System.out.print("Principal:");
		  int P = scan.nextInt();
		  
		  System.out.print("monthly interest rate:");
		  double r = scan.nextDouble();
		  
		  System.out.print("Number of payments:");
		  int n = scan.nextInt();
		  
		  double a = r* Math.pow(1+r, n);
		  
		  double b = Math.pow(1+r, n)-1;
		  
		  double M = P*a/b;
		  
		  System.out.println("Result:" + new DecimalFormat().format(M));
	 }
}
