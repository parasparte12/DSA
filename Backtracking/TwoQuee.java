public class TwoQuee {

    // 1. isSafe method stands on its own now
    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // 2. nQuees method handles just the recursion
    public static void nQuees(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';   // Place Queen
                nQuees(board, row + 1); // Recurse
                board[row][j] = '.';   // Backtrack
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------chess board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count=0;

    public static void main(String args[]) {
        int n = 5;
        char board[][] = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        nQuees(board, 0);
        System.out.println("Total ways to place n  queens: " + count);
    }
}