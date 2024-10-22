import java.util.Scanner;

public class PrioritySchedulingSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] pid = new int[n], arrival = new int[n], burst = new int[n], priority = new int[n];
        int[] waiting = new int[n], turnaround = new int[n];
        boolean[] completed = new boolean[n];

        for (int i = 0; i < n; i++) {
            pid[i] = i + 1;
            System.out.print("Enter arrival time, burst time, and priority for process " + pid[i] + ": ");
            arrival[i] = sc.nextInt();
            burst[i] = sc.nextInt();
            priority[i] = sc.nextInt();
        }

        int currentTime = 0, completedCount = 0;
        double totalWait = 0, totalTurnaround = 0;

        while (completedCount < n) {
            int highestPriorityIndex = -1, highestPriority = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if (arrival[i] <= currentTime && !completed[i] && priority[i] < highestPriority) {
                    highestPriority = priority[i];
                    highestPriorityIndex = i;
                }
            }

            if (highestPriorityIndex == -1) {
                currentTime++;
                continue;
            }

            currentTime += burst[highestPriorityIndex];
            waiting[highestPriorityIndex] = currentTime - arrival[highestPriorityIndex] - burst[highestPriorityIndex];
            turnaround[highestPriorityIndex] = waiting[highestPriorityIndex] + burst[highestPriorityIndex];
            totalWait += waiting[highestPriorityIndex];
            totalTurnaround += turnaround[highestPriorityIndex];
            completed[highestPriorityIndex] = true;
            completedCount++;
        }

        System.out.println("P\tA\tB\tP\tW\tT");
        for (int i = 0; i < n; i++) {
            System.out.println(pid[i] + "\t" + arrival[i] + "\t" + burst[i] + "\t" + priority[i] + "\t" + waiting[i] + "\t" + turnaround[i]);
        }

        System.out.printf("Avg Waiting Time: %.2f\n", totalWait / n);
        System.out.printf("Avg Turnaround Time: %.2f\n", totalTurnaround / n);
    }
}

