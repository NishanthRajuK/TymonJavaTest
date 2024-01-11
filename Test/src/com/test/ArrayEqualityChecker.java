package com.test;

import java.util.Arrays;

public class ArrayEqualityChecker {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 4, 3, 2, 1 };
		int[] array3 = { 1, 2, 3, 4, 5 };

		System.out.println("Array1 and Array2 are equal: " + arraysAreEqual(array1, array2));
		System.out.println("Array1 and Array3 are equal: " + arraysAreEqual(array1, array3));
	}

	private static boolean arraysAreEqual(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		return true;
	}
}
