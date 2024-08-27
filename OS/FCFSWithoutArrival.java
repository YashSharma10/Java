public class FCFSWithoutArrival {
    public static void main(String[] args) {
        int[] burstTime = { 4, 3, 1, 2, 3 };
        int n = burstTime.length;

        int[] waitingTime = new int[n];
        int[] turnAroundTime = new int[n];

        waitingTime[0] = 0;
        turnAroundTime[0] = burstTime[0];

        for (int i = 1; i < n; i++) {
            waitingTime[i] = turnAroundTime[i - 1];
            turnAroundTime[i] = waitingTime[i] + burstTime[i];
        }

        System.out.println("Process\tBurst\tWaiting\tTurnaround");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + burstTime[i] + "\t" + waitingTime[i] + "\t" + turnAroundTime[i]);
        }
    }
}
