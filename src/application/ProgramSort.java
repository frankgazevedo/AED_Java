package application;

import entities.BubbleSort;
import entities.InsertionSort;

public class ProgramSort {
	public static void main(String[] args) {
		int length = 10;
		int[] vector = new int[length];
		int[] clone = new int[length];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) Math.floor(Math.random() * vector.length);
		}

		// Printing unsorted vector
		System.out.println("Unsorted vector");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
		}

		// Bubble Sort
		System.out.println("\n\nBubble Sort");
		long timeBeginning = System.currentTimeMillis();
		clone = BubbleSort.sort(vector.clone());
		long timeEnding = System.currentTimeMillis();

		// Printing sorted vector
		for (int i = 0; i < clone.length; i++) {
			System.out.print(clone[i] + " ");
		}
		System.out.println("\nBubble Sort time: " + (timeEnding - timeBeginning) + "ms");
		
		// Insertion Sort
		System.out.println("\n\nInsertion Sort");
		timeBeginning = System.currentTimeMillis();
		clone = InsertionSort.sort(vector.clone());
		timeEnding = System.currentTimeMillis();

		// Printing sorted vector
		for (int i = 0; i < clone.length; i++) {
			System.out.print(clone[i] + " ");
		}
		System.out.println("\nInsertion Sort time: " + (timeEnding - timeBeginning) + "ms");

	}

}
