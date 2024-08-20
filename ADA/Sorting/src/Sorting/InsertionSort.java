package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] b = {1, 4, 2, 6, 4, 7, 9, 5, 8, 3};
        Sort(b);
        System.out.println(Arrays.toString(b));

	}
	static void Sort(int[] arr) {
		int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
	}

}
