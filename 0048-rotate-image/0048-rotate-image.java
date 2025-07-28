class Solution {
    void reverseMatrix(int [] matrix)
    {
        int s =0;
        int e = matrix.length-1;
        while(s<e)
        {
            int temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;
            e--;
        }
    }
    public void rotate(int[][] matrix) {
        // step 1 -> transpose the matrix
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix[0].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // step 2-> reverse each row of resultant matrix
        for(int i=0;i<matrix.length;i++)
        {
            reverseMatrix(matrix[i]);
        }
    }   
}