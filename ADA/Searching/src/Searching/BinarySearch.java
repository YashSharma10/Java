package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = new int[5];
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array");
        for(int i = 0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter value to search");
        int c = sc.nextInt();
        System.out.println("Found at index : "+Search(a, c));
    }

    static int Search(int[] a, int target) {
        int start = 0, end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == target) {
                return mid;
            } else if (a[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
