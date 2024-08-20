package Array;

import java.util.Random;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Random rand = new Random(100);
		Scanner sc = new Scanner(System.in);
		int[] arg = new int[1000000];
		System.out.println("Enter the number of elemennts : ");
        int n=5;
        for (int i = 0; i < n; i++) {
            arg[i] = rand.nextInt(100);
        }
        System.out.println("elemennts : ");
        for (int i = 0; i < n; i++) {
            System.out.println(arg[i]);
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arg[i];
        }
        int asum=0;
        System.out.println("Sum = "+sum);
        for (int i = 0; i < n; i=i+2) {
            asum=asum+arg[i];
        }
        System.out.println("alternate Sum = "+asum);
        
        int highest = 0;
        int secondHighest = 0;

        for (int i = 0; i < 5; i++) {
            if (arg[i] > highest) {
                secondHighest = highest;
                highest = arg[i];
            } else if (arg[i] > secondHighest && arg[i] != highest) {
                secondHighest = arg[i];
            }
        }

        System.out.println("Second highest element: " + secondHighest);

	}

}
