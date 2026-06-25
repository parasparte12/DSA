
public class spiral {

    // 1. Move your logic inside a proper static method
    public static void printSpiral(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top boundary        // top boundry   // as row is fixed and col is changing

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            
            // Right boundary        // right boundry  // as col is fixed and row is changing // here we are starting from startRow+1 because we have already printed the element at startRow and endCol

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom boundary        // bottom boundry  // as row is fixed and col is changing // here we are starting from endCol-1 because we have already printed the element at endRow and endCol

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) { // this is for the case when we have only one row left in the matrix

                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Left boundary        // left boundry  // as col is fixed and row is changing // here we are starting from endRow-1 because we have already printed the element at endRow and startCol

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) { // this is for the case when we have only one column left in the matrix
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            // Move the boundaries inward
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // 2. Call the method correctly
        printSpiral(matrix);
    }
}