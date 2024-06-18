class Solution {
    public void setZeroes(int[][] matrix) {

         int n = matrix.length;
        int m = matrix[0].length;

        boolean col0 = false; // Flag to track if the first column has a zero

        // Step 1: Traverse the matrix and mark 1st row & col accordingly
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                col0 = true; // If the first column has a zero, set the flag to true
            }
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the ith row
                    matrix[0][j] = 0; // Mark the jth column
                }
            }
        }

        // Step 2: Mark with 0 from (1,1) to (n-1, m-1)
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Finally mark the 1st col & then 1st row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0; // Mark the first row
            }
        }
        if (col0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0; // Mark the first column
            }
        }
        
    }
}