package Array;
import java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[] a1 = new int[50];
        for (int i = 0; i < 50; i++) {
            a1[i] = rand.nextInt(10);
        }
        for (int i = 0; i < 50; i++) {
            System.out.println(a1[i]);
        }
        System.out.println("enter number");
        int a = sc.nextInt();
        int count = 0;
        long starttime = System.nanoTime();
        for (int i = 0; i < 50; i++) {
            if (a1[i] == a) {
                System.out.println("number found on " + (i + 1));
            } else {
            }
        }
        long endtime = System.nanoTime();
        long total = endtime - starttime;
        System.out.println("TIME = " + total + " nanoseconds");
    }
}
