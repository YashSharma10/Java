import java.util.Scanner;

public class SimpleBankersAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = sc.nextInt();
        System.out.print("Enter the number of resources: ");
        int numResources = sc.nextInt();

        int[] available = new int[numResources];
        System.out.println("Enter available resources: ");
        for (int i = 0; i < numResources; i++) {
            available[i] = sc.nextInt();
        }

        int[][] max = new int[numProcesses][numResources];
        System.out.println("Enter the maximum resources each process can request: ");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Process " + i + ": ");
            for (int j = 0; j < numResources; j++) {
                max[i][j] = sc.nextInt();
            }
        }

        int[][] allocation = new int[numProcesses][numResources];
        System.out.println("Enter the allocated resources for each process: ");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println("Process " + i + ": ");
            for (int j = 0; j < numResources; j++) {
                allocation[i][j] = sc.nextInt();
            }
        }
        int[][] need = new int[numProcesses][numResources];
        for (int i = 0; i < numProcesses; i++) {
            for (int j = 0; j < numResources; j++) {
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }

        boolean[] finished = new boolean[numProcesses];
        int[] safeSequence = new int[numProcesses];
        int[] work = available.clone();
        int count = 0;

        while (count < numProcesses) {
            boolean found = false;
            for (int i = 0; i < numProcesses; i++) {
                if (!finished[i]) {
                    boolean canAllocate = true;
                    for (int j = 0; j < numResources; j++) {
                        if (need[i][j] > work[j]) {
                            canAllocate = false;
                            break;
                        }
                    }
                    if (canAllocate) {
                        for (int j = 0; j < numResources; j++) {
                            work[j] += allocation[i][j];
                        }
                        safeSequence[count++] = i;
                        finished[i] = true;
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("The system is not in a safe state.");
                return;
            }
        }

        System.out.println("The system is in a safe state.");
        System.out.print("Safe sequence: ");
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("P" + safeSequence[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
