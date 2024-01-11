package com.test;

public class StringImmutability {
	public static void main(String[] args) {
		String originalString = "Hello";

		String modifiedString = originalString.concat(" World");

		System.out.println("Original String: " + originalString);
		System.out.println("Modified String: " + modifiedString);

		System.out.println("Are references equal? " + (originalString == modifiedString));

		System.out.println("Original String after modification: " + originalString);
	}
}
