package DP;

import java.util.Scanner;

public class Knapsack {

    static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    dp[i][w] = 0;
                else if (wt[i - 1] <= w)
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                else
                    dp[i][w] = dp[i - 1][w];
            }
        }

        printDPTable(dp, n, W); 
        return dp[n][W];
    }

static void printDPTable(int[][] dp, int n, int W) {
    for (int w = 0; w <= W; w++) {
        System.out.printf("%5d", w); 
    }
    System.out.println(); 

    for (int i = 0; i <= n; i++) {
        if (i > 0) {
            System.out.printf("Item %d", i);
        } else {
            System.out.printf("%5s", " "); 
        }
        for (int w = 0; w <= W; w++) {
            System.out.printf("%5d", dp[i][w]); 
        }
        System.out.println(); 
    }
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();

        int[] val = new int[n];
        int[] wt = new int[n];

        System.out.println("Enter the values of items:");
        for (int i = 0; i < n; i++) {
            val[i] = scanner.nextInt();
        }

        System.out.println("Enter the weights of items:");
        for (int i = 0; i < n; i++) {
            wt[i] = scanner.nextInt();
        }

        System.out.print("Enter the capacity of knapsack: ");
        int W = scanner.nextInt();

        System.out.println("\nInputs:");
        System.out.println("Values of items: ");
        for (int value : val) {
            System.out.print(value + " ");
        }
        System.out.println("\nWeights of items: ");
        for (int weight : wt) {
            System.out.print(weight + " ");
        }
        System.out.println("\nCapacity of knapsack: " + W);

        int maxValue = knapSack(W, wt, val, n);

        System.out.println("\nMaximum value that can be put in a knapsack of capacity " + W + " is " + maxValue);
        scanner.close();
    }
}