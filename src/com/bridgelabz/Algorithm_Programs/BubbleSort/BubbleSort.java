package com.bridgelabz.Algorithm_Programs.BubbleSort;

import java.util.Scanner;

public class BubbleSort {

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

	static void insertionSort(String arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		printArray(arr);
	}

	static void printArray(String arr[]) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSorting(String[] stringArray) {

		for (int i = 0; i < stringArray.length - 1; i++) {
			for (int j = 0; j < stringArray.length - i - 1; j++) {
				if (stringArray[j].compareTo(stringArray[j + 1]) > 0) {
					String temp = stringArray[j];
					stringArray[j] = stringArray[j + 1];
					stringArray[j + 1] = temp;
				}
			}
		}
		printArray(stringArray);
	}
}