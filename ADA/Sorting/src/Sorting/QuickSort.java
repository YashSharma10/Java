package Sorting;
public class QuickSort {
    
    public static void quickSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int low, int high) {
        int i = low, j = high;
        
        int pivot = array[low + (high - low) / 2];

       
        while (i <= j) {
            
            while (array[i] < pivot) {
                i++;
            }
           
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(array, i, j);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            sort(array, low, j);
        if (i < high)
            sort(array, i, high);
    }

    private static void exchange(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2, 7, 1, 10, 6, 9 };
        quickSort(arr);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}