import java.util.Scanner;

public class SJFNonPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] pid = new int[n];
        int[] arrival = new int[n];
        int[] burst = new int[n];
        int[] waiting = new int[n];
        int[] turnaround = new int[n];
        boolean[] completed = new boolean[n];

        for (int i = 0; i < n; i++) {
            pid[i] = i + 1;
            System.out.print("Enter arrival time and burst time for process " + pid[i] + ": ");
            arrival[i] = sc.nextInt();
            burst[i] = sc.nextInt();
        }

        int currentTime = 0, completedCount = 0;
        double totalWait = 0, totalTurnaround = 0;

        while (completedCount < n) {
            int shortestIndex = -1;
            int minBurstTime = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arrival[i] <= currentTime && !completed[i] && burst[i] < minBurstTime) {
                    minBurstTime = burst[i];
                    shortestIndex = i;
                }
            }

            if (shortestIndex == -1) {
                currentTime++;
                continue;
            }

            currentTime += burst[shortestIndex];
            waiting[shortestIndex] = currentTime - arrival[shortestIndex] - burst[shortestIndex];
            turnaround[shortestIndex] = waiting[shortestIndex] + burst[shortestIndex];

            totalWait += waiting[shortestIndex];
            totalTurnaround += turnaround[shortestIndex];
            completed[shortestIndex] = true;
            completedCount++;
        }

        System.out.println("Process\tArrival\tBurst\tWaiting\tTurnaround");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    "P" + pid[i] + "\t" + arrival[i] + "\t" + burst[i] + "\t" + waiting[i] + "\t" + turnaround[i]);
        }

        System.out.printf("Average Waiting Time: %.2f\n", totalWait / n);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTurnaround / n);
    }
}
