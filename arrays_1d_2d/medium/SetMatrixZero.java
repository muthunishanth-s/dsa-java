package arrays_1d_2d.medium;

import java.util.Arrays;

public class SetMatrixZero {

    static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: Check whether first row contains zero
        for(int i = 0; i < col; i++)
        {
            if(matrix[0][i] == 0) firstRowZero = true;
        }

        // Step 2: Check whether first column contains zero
        for(int i = 0; i < row; i++)
        {
            if(matrix[i][0] == 0) firstColZero = true;
        }

        // Step 3: Use first row and first column as markers
        // First row stores which columns need to become zero
        // First column stores which rows need to become zero
        // If matrix[i][j] is zero, mark its corresponding row and column
        for(int i = 1; i < row; i++)
        {
            for(int j = 1; j < col; j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Step 4: Check column markers and make entire columns zero
        for(int i = 1; i < col; i++)
        {
            if(matrix[0][i] == 0)
            {
                for(int j = 1; j < row; j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }

        // Step 5: Check row markers and make entire rows zero
        for(int i = 1; i < row; i++)
        {
            if(matrix[i][0] == 0)
            {
                for(int j = 1; j < col; j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 6: If original first row had zero, make it completely zero
        if(firstRowZero)
        {
            for(int i = 0; i < col; i++)
            {
                matrix[0][i] = 0;
            }
        }

        // Step 7: If original first column had zero, make it completely zero
        if(firstColZero)
        {
            for(int i = 0; i < row; i++)
            {
                matrix[i][0] = 0;
            }
        }

    }
    
    public static void main(String[] args) {
        // m x n
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }
}
