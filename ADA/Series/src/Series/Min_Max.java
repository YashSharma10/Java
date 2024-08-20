package Series;

import java.util.Random;
import java.util.Scanner;

public class Min_Max {

    public static void main(String[] args) {
        Random ran = new Random();
        @SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("\nMIN. =  " + min);
        System.out.println("MAX. =  " + max);
    }
}
