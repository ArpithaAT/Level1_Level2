package swap;

import java.util.Scanner;

public class swapNumber {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter the second number: ");
	        int b = sc.nextInt();

	        System.out.println("Before swapping:");
	        
	        System.out.println("First number: " + a);
	        System.out.println("Second number: " + b);

	   
	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After swapping:");
	        
	        System.out.println("First number: " + a);
	        System.out.println("Second number: " + b);
	    }
	}

