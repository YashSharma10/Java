package DP;

import java.util.Arrays;

public class TSP {

    static double[][] cities;
    static int[] bestPath;
    static double minDistance = Double.POSITIVE_INFINITY;

    public static void main(String[] args) {
        // Example usage
        double[][] cityCoordinates = {{0, 0}, {1, 2}, {3, 1}, {2, 3}};
        System.out.println("Minimum Distance: " + solveTSP(cityCoordinates));
        System.out.println("Best Path: " + Arrays.toString(bestPath));
    }

    public static double solveTSP(double[][] cityCoordinates) {
        cities = cityCoordinates;
        int n = cities.length;
        int[] path = new int[n];
        for (int i = 0; i < n; i++) {
            path[i] = i;
        }
        permute(path, 1, n);
        return minDistance;
    }

    public static void permute(int[] path, int start, int n) {
        if (start == n) {
            double distance = calculateDistance(path, n);
            if (distance < minDistance) {
                minDistance = distance;
                bestPath = Arrays.copyOf(path, n);
            }
        } else {
            for (int i = start; i < n; i++) {
                swap(path, start, i);
                permute(path, start + 1, n);
                swap(path, start, i);
            }
        }
    }

    public static double calculateDistance(int[] path, int n) {
        double distance = 0;
        for (int i = 0; i < n - 1; i++) {
            int city1 = path[i];
            int city2 = path[i + 1];
            distance += Math.sqrt(Math.pow(cities[city1][0] - cities[city2][0], 2) +
                    Math.pow(cities[city1][1] - cities[city2][1], 2));
        }
        // Return to the starting city
        int firstCity = path[0];
        int lastCity = path[n - 1];
        distance += Math.sqrt(Math.pow(cities[lastCity][0] - cities[firstCity][0], 2) +
                Math.pow(cities[lastCity][1] - cities[firstCity][1], 2));
        return distance;
    }

    public static void swap(int[] path, int i, int j) {
        int temp = path[i];
        path[i] = path[j];
        path[j] = temp;
    }
}

