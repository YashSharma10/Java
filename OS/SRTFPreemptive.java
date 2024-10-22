import java.util.Scanner;

public class SRTFPreemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] pid = new int[n]; // Process IDs
        int[] arrival = new int[n]; // Arrival times
        int[] burst = new int[n]; // Burst times
        int[] remaining = new int[n]; // Remaining burst times
        int[] waiting = new int[n]; // Waiting times
        int[] turnaround = new int[n]; // Turnaround times

        for (int i = 0; i < n; i++) {
            pid[i] = i + 1;
            System.out.print("Enter arrival time and burst time for process " + pid[i] + ": ");
            arrival[i] = sc.nextInt();
            burst[i] = sc.nextInt();
            remaining[i] = burst[i]; 
        }

        int currentTime = 0, completedCount = 0, shortest = -1;
        boolean foundProcess = false;
        double totalWait = 0, totalTurnaround = 0;

        while (completedCount < n) {
            int minRemainingTime = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arrival[i] <= currentTime && remaining[i] > 0 && remaining[i] < minRemainingTime) {
                    minRemainingTime = remaining[i];
                    shortest = i;
                    foundProcess = true;
                }
            }

            if (!foundProcess) {
                currentTime++;
                continue;
            }

            remaining[shortest]--;

            if (remaining[shortest] == 0) {
                completedCount++;
                int finishTime = currentTime + 1;
                turnaround[shortest] = finishTime - arrival[shortest];
                waiting[shortest] = turnaround[shortest] - burst[shortest];

                totalWait += waiting[shortest];
                totalTurnaround += turnaround[shortest];
            }

            currentTime++;
            foundProcess = false;
        }

        System.out.println("Process\tArrival\tBurst\tWaiting\tTurnaround");
        for (int i = 0; i < n; i++) {
            System.out.println("P" + pid[i] + "\t" + arrival[i] + "\t" + burst[i] + "\t" + waiting[i] + "\t" + turnaround[i]);
        }

        System.out.printf("Average Waiting Time: %.2f\n", totalWait / n);
        System.out.printf("Average Turnaround Time: %.2f\n", totalTurnaround / n);
    }
}
