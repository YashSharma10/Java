import java.util.Scanner;

public class RoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = sc.nextInt();
        int[] burstTime = new int[numProcesses];
        int[] remainingTime = new int[numProcesses];
        int[] waitingTime = new int[numProcesses];
        int[] turnaroundTime = new int[numProcesses];

        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter burst time for Process " + (i + 1) + ": ");
            burstTime[i] = sc.nextInt();
            remainingTime[i] = burstTime[i];
        }

        System.out.print("Enter time quantum: ");
        int timeQuantum = sc.nextInt();
        int currentTime = 0;
        boolean processesLeft;

        do {
            processesLeft = false;

            for (int i = 0; i < numProcesses; i++) {
                if (remainingTime[i] > 0) {
                    processesLeft = true;

                    if (remainingTime[i] > timeQuantum) {
                        currentTime += timeQuantum;
                        remainingTime[i] -= timeQuantum;
                    } else {
                        currentTime += remainingTime[i];
                        turnaroundTime[i] = currentTime;
                        waitingTime[i] = turnaroundTime[i] - burstTime[i];
                        remainingTime[i] = 0;
                        System.out.println("Process " + (i + 1) + " completed at time " + currentTime);
                    }
                }
            }
        } while (processesLeft);

        System.out.println("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println((i + 1) + "\t\t" + burstTime[i] + "\t\t" + waitingTime[i] + "\t\t" + turnaroundTime[i]);
        }

        double avgWaitingTime = 0, avgTurnaroundTime = 0;
        for (int i = 0; i < numProcesses; i++) {
            avgWaitingTime += waitingTime[i];
            avgTurnaroundTime += turnaroundTime[i];
        }
        avgWaitingTime /= numProcesses;
        avgTurnaroundTime /= numProcesses;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);

        sc.close();
    }
}
