package Greedy;

import java.util.*;

class KruskalMST {
    static class Edge {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static int[][] findMST(int[][] graph) {
        int V = graph.length;
        List<Edge> edges = new ArrayList<>();

        for (int src = 0; src < V; src++) {
            for (int dest = src + 1; dest < V; dest++) {
                if (graph[src][dest] != 0) {
                    edges.add(new Edge(src, dest, graph[src][dest]));
                }
            }
        }

        sortEdges(edges);

        int[][] MST = new int[V][V];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        int edgeCount = 0;
        for (Edge edge : edges) {
            int src = edge.src, dest = edge.dest, weight = edge.weight;
            int x = find(parent, src);
            int y = find(parent, dest);

            if (x != y) {
                MST[src][dest] = weight;
                MST[dest][src] = weight;
                parent[x] = y;
                edgeCount++;
            }

            if (edgeCount >= V - 1)
                break;
        }

        return MST;
    }

    static void sortEdges(List<Edge> edges) {
        for (int i = 0; i < edges.size() - 1; i++) {
            for (int j = 0; j < edges.size() - i - 1; j++) {
                if (edges.get(j).weight > edges.get(j + 1).weight) {
                    Edge temp = edges.get(j);
                    edges.set(j, edges.get(j + 1));
                    edges.set(j + 1, temp);
                }
            }
        }
    }

    static int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        else
            return find(parent, parent[i]);
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        int[][] MST = findMST(graph);

        System.out.println("Minimum Spanning Tree:");
        int totalWeight = 0;
        for (int i = 0; i < MST.length; i++) {
            for (int j = i + 1; j < MST[0].length; j++) {
                if (MST[i][j] != 0) {
                    System.out.println("Edge: " + i + " - " + j + ", Weight: " + MST[i][j]);
                    totalWeight += MST[i][j];
                }
            }
        }
        System.out.println("Total Weight of MST: " + totalWeight);
    }
}
