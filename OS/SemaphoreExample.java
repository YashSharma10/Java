import java.util.concurrent.Semaphore;

class SemaphoreExample {
    private static Semaphore mutex = new Semaphore(1);  // Mutex to protect readCount
    private static Semaphore wrt = new Semaphore(1);    // Semaphore for writers
    private static int readCount = 0;  // Count of current readers

    // Reader thread
    static class Reader extends Thread {
        public void run() {
            try {
                mutex.acquire(); // Enter critical section
                readCount++;     // Increment reader count
                if (readCount == 1) {
                    wrt.acquire(); // First reader blocks writers
                }
                mutex.release(); // Exit critical section

                // Reading the resource
                System.out.println("Reader " + Thread.currentThread().getId() + " is reading.");
                Thread.sleep(1000); // Simulate reading

                mutex.acquire(); // Enter critical section
                readCount--;     // Decrement reader count
                if (readCount == 0) {
                    wrt.release(); // Last reader releases the writer semaphore
                }
                mutex.release(); // Exit critical section
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Writer thread
    static class Writer extends Thread {
        public void run() {
            try {
                wrt.acquire(); // Writer gets exclusive access

                // Writing the resource
                System.out.println("Writer " + Thread.currentThread().getId() + " is writing.");
                Thread.sleep(1000); // Simulate writing

                wrt.release(); // Release writer semaphore
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        // Create reader and writer threads
        Thread[] readers = new Thread[3];
        Thread[] writers = new Thread[2];

        for (int i = 0; i < 3; i++) {
            readers[i] = new Reader();
        }

        for (int i = 0; i < 2; i++) {
            writers[i] = new Writer();
        }

        // Start reader and writer threads
        for (int i = 0; i < 3; i++) {
            readers[i].start();
        }

        for (int i = 0; i < 2; i++) {
            writers[i].start();
        }
    }
}
