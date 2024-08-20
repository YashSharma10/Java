package BranchAndBound;

import java.util.Arrays;

class Item implements Comparable<Item> {
    int weight;
    int value;
    double density;
    int index;

    public Item(int weight, int value, int index) {
        this.weight = weight;
        this.value = value;
        this.index = index;
        this.density = (double) value / weight;
    }

    @Override
    public int compareTo(Item other) {
        if (this.density < other.density)
            return 1;
        else if (this.density > other.density)
            return -1;
        else
            return 0;
    }
}

public class Knapsack{

    public static int knapsack(int W, int[] wt, int[] val, int N) {
        Item[] items = new Item[N];
        for (int i = 0; i < N; i++) {
            items[i] = new Item(wt[i], val[i], i);
        }

        Arrays.sort(items);

        int[] used = new int[N];
        Arrays.fill(used, -1);

        int maxValue = 0;
        int currentWeight = 0;

        for (int i = 0; i < N; i++) {
            if (currentWeight + items[i].weight <= W) {
                used[items[i].index] = 1;
                currentWeight += items[i].weight;
                maxValue += items[i].value;
            } else {
                break;
            }
        }

        System.out.println("Item\tValue\tWeight\tSelected");
        for (int i = 0; i < N; i++) {
            System.out.println((i+1) + "\t" + val[i] + "\t" + wt[i] + "\t" + ((used[i] == 1) ? "Yes" : "No"));
        }

        return maxValue;
    }

    public static void main(String[] args) {
        int[] wt = {4, 5, 1};
        int[] val = {1, 2, 3};
        int W = 4;
        int N = 3;

        int maxValue = knapsack(W, wt, val, N);
        System.out.println("\nMaximum value in knapsack: " + maxValue);
    }
}
