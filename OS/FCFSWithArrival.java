public class FCFSWithArrival {
    public static void main(String[] args) {
        int[] arrivalTime = {0, 2, 3, 5, 6}; // Arrival times of processes
        int[] burstTime = {4, 3, 1, 2, 3};  // Burst times of processes
        int n = arrivalTime.length;

        int[] waitingTime = new int[n];
        int[] turnAroundTime = new int[n];

        // Calculate waiting and turnaround times
        waitingTime[0] = 0; // First process has no waiting time
        turnAroundTime[0] = burstTime[0]; // Turnaround time for the first process

        for (int i = 1; i < n; i++) {
            waitingTime[i] = turnAroundTime[i - 1] - arrivalTime[i];
            if (waitingTime[i] < 0){
            waitingTime[i] = 0;
            turnAroundTime[i] = waitingTime[i] + burstTime[i];
            }
        }

        // Print results
        System.out.println("Process\tArrival\tBurst\tWaiting\tTurnaround");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + arrivalTime[i] + "\t" + burstTime[i] + "\t" + waitingTime[i] + "\t" + turnAroundTime[i]);
        }
    }
}
