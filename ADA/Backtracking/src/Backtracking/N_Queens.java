package Backtracking;

public class N_Queens {
    public static void main(String[] args) {
        int n = 8;
        boolean[][] board = new boolean[n][n];
        int totalSolutions = queens(board, 0);
        System.out.println("Total number of distinct solutions for " + n + "-Queens problem: " + totalSolutions);
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            return 1;
        }
        int count = 0;
        // Placing the queen and checking for every row and column
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // Diagonal left
        int maxleft = Math.min(row, col);
        for (int i = 0; i <= maxleft; i++) {
            if (board[row - i][col - i])
                return false;
        }
        // Diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        System.out.println("Solution:");
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println(); // Add an extra line break between solutions
    }
}
