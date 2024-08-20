package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		int n = arr.length;

		System.out.println("Given Array");
		printArray(arr);

		Sort(arr, 0, n - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}

	static void Sort(int[] a, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			Sort(a, start, mid);
			Sort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}

	static void merge(int[] a, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;

		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];

		for (int i = 0; i < n1; ++i)
			leftArr[i] = a[start + i];
		for (int j = 0; j < n2; ++j)
			rightArr[j] = a[mid + 1 + j];

		int i = 0, j = 0;
		int k = start;

		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				a[k] = leftArr[i];
				i++;
			} else {
				a[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			a[k] = leftArr[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = rightArr[j];
			j++;
			k++;
		}
	}

	static void printArray(int[] arr) {
		@SuppressWarnings("unused")
		int n = arr.length;
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
	}
}
