package Greedy;

import java.util.Scanner;

public class Knapsack {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numItems = sc.nextInt();

        int[] values = new int[numItems];
        int[] weights = new int[numItems];

        System.out.println("Enter values and weights for " + numItems + " items:");
        for (int i = 0; i < numItems; i++) {
            values[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        int capacity = 50;

        System.out.println("Given values and weights arrays:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value: " + values[i] + ", Weight: " + weights[i]);
        }

        mergeSort(values, weights, 0, values.length - 1);

        System.out.println("\nSorted arrays based on value-to-weight ratio:");
        for (int i = 0; i < values.length; i++) {
            System.out.println("Value: " + values[i] + ", Weight: " + weights[i]);
        }

        double maxValue = fractionalKnapsack(capacity, values, weights);
        System.out.println("\nMaximum value in Fractional Knapsack: " + maxValue);
    }

    static void mergeSort(int[] values, int[] weights, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(values, weights, start, mid);
            mergeSort(values, weights, mid + 1, end);
            merge(values, weights, start, mid, end);
        }
    }

    static void merge(int[] values, int[] weights, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftValues = new int[n1];
        int[] leftWeights = new int[n1];

        int[] rightValues = new int[n2];
        int[] rightWeights = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftValues[i] = values[start + i];
            leftWeights[i] = weights[start + i];
        }

        for (int j = 0; j < n2; ++j) {
            rightValues[j] = values[mid + 1 + j];
            rightWeights[j] = weights[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < n1 && j < n2) {
            double ratio1 = (double) leftValues[i] / leftWeights[i];
            double ratio2 = (double) rightValues[j] / rightWeights[j];

            if (ratio1 < ratio2) {
                values[k] = leftValues[i];
                weights[k] = leftWeights[i];
                i++;
            } else {
                values[k] = rightValues[j];
                weights[k] = rightWeights[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            values[k] = leftValues[i];
            weights[k] = leftWeights[i];
            i++;
            k++;
        }

        while (j < n2) {
            values[k] = rightValues[j];
            weights[k] = rightWeights[j];
            j++;
            k++;
        }
    }

    static double fractionalKnapsack(int capacity, int[] values, int[] weights) {
        int n = values.length;

        double totalValue = 0.0;
        int currentWeight = 0;
        int index = 0;

        System.out.println("\nStep\tRemaining Capacity");
        while (index < n && currentWeight < capacity) {
            int remainingCapacity = capacity - currentWeight;
            System.out.println((index + 1) + "  " + remainingCapacity);

            if (currentWeight + weights[index] <= capacity) {
                totalValue += values[index];
                currentWeight += weights[index];
            } else {
                double fraction = (double) (capacity - currentWeight) / weights[index];
                totalValue += values[index] * fraction;
                currentWeight = capacity;
            }
            index++;
        }

        return totalValue;
    }
}
