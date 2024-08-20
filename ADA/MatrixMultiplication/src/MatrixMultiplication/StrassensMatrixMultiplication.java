package MatrixMultiplication;

import java.util.Scanner;

public class StrassensMatrixMultiplication {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        System.out.println("<-- Welcome to Matrix Multiplication -->");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        System.out.println("Input Matrix A");
        System.out.println("Enter elements of matrix A (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element A[" + (i+1) + "][" + (j+1) + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Input Matrix B");
        System.out.println("Enter elements of matrix B (2x2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter element B[" + (i+1) + "][" + (j+1) + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        int P = (A[0][0] + A[1][1]) * (B[0][0] + B[1][1]);
        int Q = B[0][0] * (A[1][0] + A[1][1]);
        int R = A[0][0] * (B[0][1] - B[1][1]);
        int S = A[1][1] * (B[1][0] - B[0][0]);
        int T = B[1][1] * (A[0][0] + A[0][1]);
        int U = (A[1][0] - A[0][0]) * (B[0][0] + B[0][1]);
        int V = (A[0][1] - A[1][1]) * (B[1][0] + B[1][1]);

        int c11 = P + S - T + V;
        int c12 = R + T;
        int c21 = Q + S;
        int c22 = P + R - Q + U;

        System.out.println("Intermediate variables:");
        System.out.println("P = " + P);
        System.out.println("Q = " + Q);
        System.out.println("R = " + R);
        System.out.println("S = " + S);
        System.out.println("T = " + T);
        System.out.println("U = " + U);
        System.out.println("V = " + V);

        System.out.println("Resultant Matrix C obtained using Strassen Matrix Multiplication:");
        System.out.println(c11 + " " + c12);
        System.out.println(c21 + " " + c22);

    }
}