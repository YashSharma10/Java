package Threads;

import java.util.Random;
class Abc{
	public static class Square extends Thread {
        int x;

        Square(int n) {
            x = n;
        }

        public void run() {
            int sqr = x * x;
            System.out.println("Square of " + x + " = " + sqr);
        }
    }

    public static class Cube extends Thread {
        int x;

        Cube(int n) {
            x = n;
        }

        public void run() {
            int cub = x * x * x;
            System.out.println("Cube of " + x + " = " + cub);
        }
    }
    public void start() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInteger = random.nextInt(100);
            System.out.println("Random Integer Generated: " + randomInteger);
            Square s = new Square(randomInteger);
            s.start();
            Cube c = new Cube(randomInteger);
            c.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

}
public class Random_num {

    
    public static void main(String args[]) {
        Abc mtu3 = new Abc();
        mtu3.start();
    }

   
}