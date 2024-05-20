package dsa.sorting;

public class BubbleSort {
	void bubbleSort(int[] arr) {
		boolean swapped;
		int lengthOfArray = arr.length;
		int i = 0;
		do {
			swapped = false;
			for (int j = 0; j < lengthOfArray - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			i++;
		} while (swapped);

	}
}
