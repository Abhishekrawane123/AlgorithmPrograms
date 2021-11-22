package com.bridgelabz.Algorithm_Programs;

import java.util.Scanner;

public class BinarySearchWord {

	static int binarySearch(String[] arr, String str) {

		int index = 0;
		while (index < arr.length) {

			if (str.equals(arr[index])) {
				return index;
			}
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {

		String string = "An,algorithm,is,a,set,of,instructions,for,solving,logical,and,mathematical,problems";
		String[] stringArray = string.split(",");

		System.out.println("enter a word to search");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int result = binarySearch(stringArray, str);

		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);

	}
}