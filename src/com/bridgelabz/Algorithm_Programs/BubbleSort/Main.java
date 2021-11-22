package com.bridgelabz.Algorithm_Programs.BubbleSort;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String string = "An,algorithm,is,a,set,of,instructions,for,solving,logical,and,mathematical,problems";
		String[] stringArray = string.split(",");

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("enter 0 : for exit \n ente 1 : for search \n enter 2 : for insertion sorting "
					+ "\n enter 3 : for bubbleSort");
			int num = scanner.nextInt();

			switch (num) {

			case 0:
				System.out.println("--------END--------");
				break;
			case 1:
				System.out.println("enter a word to search");
				String str = scanner.next();
				int result = BubbleSort.binarySearch(stringArray, str);

				if (result == -1)
					System.out.println("Element not present");
				else
					System.out.println("Element found at " + "index " + result);
				break;
			case 2:
				BubbleSort.insertionSort(stringArray);
				break;
			case 3:
				BubbleSort.bubbleSorting(stringArray);
				break;
			default:
				System.out.println("enter valid case number ");
			}
			if (num == 0) {
				break;
			}
		}
	}
}