class Solution {
    public void rotate(int[][] matrix) {
        //System.out.print(matrix.length);
        for (int i = 0; i < matrix.length; i++){
            for (int j = i + 1; j < matrix.length; j++) {
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] -= matrix[j][i];
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            int l = 0;
            int r = matrix.length-1;
            
            while (l < r) {
                matrix[j][l] += matrix[j][r];
                matrix[j][r] = matrix[j][l] - matrix[j][r];
                matrix[j][l] -= matrix[j][r];
                l++;
                r--;
            }
        }
    }
}