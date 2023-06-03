package entities;

public class InsertionSort<TIPO> {
	public static int[] sort(int[] vector) {

		// Insertion Sort: O(N^2)

		int aux, j;
		for (int i = 1; i < vector.length; i++) { // O(N)
			aux = vector[i];
			for (j = i - 1; j >= 0 && vector[j] > aux; j--) { // O(N)
				vector[j + 1] = vector[j];
			}
			vector[j + 1] = aux;
		}
		return vector;
	}

}
