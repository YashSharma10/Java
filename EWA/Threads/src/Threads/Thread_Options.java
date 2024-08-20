package Threads;
class SquareCalculator implements Runnable {
    int number;

    public SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

class CubeCalculator implements Runnable {
    int number;

    public CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}
public class Thread_Options{
    public static void main(String[] args) {
        int number = 5;
        Thread squareThread = new Thread(new SquareCalculator(number));
        Thread cubeThread = new Thread(new CubeCalculator(number));
        squareThread.start();
        cubeThread.start();
    }
}