public class FCFSWithArrival {
    public static void main(String[] args) {
        int[] arrivalTime = { 0, 2, 7, 5, 6 };
        int[] burstTime = { 4, 4, 1, 5, 3 };
        int n = arrivalTime.length;
        int[] waitingTime = new int[n];
        int[] turnAroundTime = new int[n];

        waitingTime[0] = 0;
        turnAroundTime[0] = burstTime[0];

        float Wait = 0;
        float Turn = 0;

        for (int i = 1; i < n; i++) {
            waitingTime[i] = Math.max(0, Math.max(arrivalTime[i], turnAroundTime[i - 1]) - arrivalTime[i]);
            turnAroundTime[i] = waitingTime[i] + burstTime[i];
            Wait += waitingTime[i];
            Turn += turnAroundTime[i];
        }
        float avgWait =  Wait / n;
        float avgTurn = Turn / n;

        System.out.println("Process\tArrival\tBurst\tWaiting\tTurnaround");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" + arrivalTime[i] + "\t" + burstTime[i] + "\t" + waitingTime[i] + "\t"+ turnAroundTime[i]);
        }
        System.out.println("Average Wait time :" + avgWait);
        System.out.println("Average TurnAround Time :" + avgTurn);
    }
}