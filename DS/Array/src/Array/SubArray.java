package Array;

import java.util.Scanner;

public class SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter elements ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for(int si = 0 ; si<n;si++) {
			for(int ei =si ; ei <n;ei++) {
				for(int k = si;k<=ei;k++) {
					System.out.print(a[k] );
				}
				System.out.print(" , " );
			}
		}

	}

}

