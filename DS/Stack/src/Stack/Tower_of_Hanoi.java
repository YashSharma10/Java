package Stack;
public class Tower_of_Hanoi {
    public static void towerOfHanoi(int n, char a, char b, char c) {
        // Base case: If there's only one disk, move it from the source to the destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + a + " to " + c);
            return;
        }

        // Move n-1 disks from the source peg to the auxiliary peg using the destination peg as auxiliary
        towerOfHanoi(n - 1, a, c, b);

        // Move the nth disk from the source peg to the destination peg
        System.out.println("Move disk " + n + " from " + a + " to " + c);

        // Move the n-1 disks from the auxiliary peg to the destination peg using the source peg as auxiliary
        towerOfHanoi(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}
