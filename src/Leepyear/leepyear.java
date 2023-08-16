package Leepyear;

import java.util.Scanner;

public class leepyear {

	private static Scanner sc;

	public static void main(String[] args) {
	        sc = new Scanner(System.in);

	        System.out.print("Enter a year: ");
	        int year = sc.nextInt();

	        if (isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }

	    public static boolean isLeapYear(int year) {
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }
	}


