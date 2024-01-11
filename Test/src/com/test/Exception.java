package com.test;

public class Exception {
	public static void main(String[] args) {
		
		
		try {
			String nullString = null;
			int length = nullString.length(); 
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		}

		
		try {
			int[] numbers = { 1, 2, 3 };
			int outOfBoundsValue = numbers[5]; 
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Caught IndexOutOfBoundsException: " + e.getMessage());
		}
	}
}
