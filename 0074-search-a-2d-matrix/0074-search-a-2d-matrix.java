class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        int n= matrix[0].length;
        int L= 0;
        int R= m*n-1;

        while (L <= R) {
            int M = L + (R - L) / 2;
            int row = M / n;
            int col = M % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                L = M + 1;
            } else {
                R = M - 1;
            }
        }
        return false;
    }
}

