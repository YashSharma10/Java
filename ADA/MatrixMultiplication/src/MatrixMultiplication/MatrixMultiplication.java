package MatrixMultiplication;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the dimensions of the first matrix:");
		int rows1 = scanner.nextInt();
		int columns1 = scanner.nextInt();

		System.out.println("Enter the dimensions of the second matrix:");
		int rows2 = scanner.nextInt();
		int columns2 = scanner.nextInt();

		if (columns1 != rows2) {
			System.out.println("Matrix multiplication not possible");
			return;
		}

		System.out.println("Enter the elements of the first matrix:");
		int[][] matrix1 = new int[rows1][columns1];
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				System.out.print("Enter element at index (" + i + ", " + j + "): ");
				matrix1[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Enter the elements of the second matrix:");
		int[][] matrix2 = new int[rows2][columns2];
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				System.out.print("Enter element at index (" + i + ", " + j + "): ");
				matrix2[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Result of matrix multiplication:");
		int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
		int rows1 = matrix1.length;
		int columns1 = matrix1.length;
		int columns2 = matrix2.length;

		int[][] resultMatrix = new int[rows1][columns2];

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns2; j++) {
				for (int k = 0; k < columns1; k++) {
					resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		return resultMatrix;
	}
}
