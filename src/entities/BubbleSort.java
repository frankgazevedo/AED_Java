package entities;

public class BubbleSort {
	public static int[] sort(int[] vector) {

		// Bubble Sort: O(N^2)

		int aux;
		for (int i = 0; i < vector.length; i++) { // O(N)
			for (int j = 0; j < vector.length; j++) { // O(N)
				if (vector[i] > vector[j]) { // Changes happens here
					aux = vector[j];
					vector[j] = vector[i];
					vector[i] = aux;
				}
			}
		}

		return vector;
	}
}
