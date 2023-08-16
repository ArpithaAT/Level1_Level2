package armstrong;

import java.util.Scanner;

public class armstrong {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        if (isArmstrongNumber(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        }
	        else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }

	    public static boolean isArmstrongNumber(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int numberOfDigits = String.valueOf(number).length();

	        while (number > 0) {
	            int digit = number % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            number /= 10;
	        }

	        return originalNumber == sum;
	    }
	}


