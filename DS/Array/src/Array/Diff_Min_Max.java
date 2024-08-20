package Array;

import java.util.*;

public class Diff_Min_Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length or array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		Random rand = new Random(100);
		System.out.println("enter elements of array : ");
		for(int i =0 ; i<a.length;i++) {
			a[i] = rand.nextInt(100);
		}
		for(int i =0 ; i<a.length;i++) {
			System.out.println(a[i]);
		}
		int min=a[0], max =a[0];
		for(int i =0 ; i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("min element of array : "+min);
		System.out.println("max element of array : "+max);
		System.out.println("Difference : "+(max-min));

	}

}
