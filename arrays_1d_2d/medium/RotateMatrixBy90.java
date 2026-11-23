package arrays_1d_2d.medium;

import java.util.Arrays;

import toolkit.ArrayUtils;

public class RotateMatrixBy90 {

    static void rotate(int[][] arr)
    {

        // Transpose
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++) // j = i -> same result but peform diagonal Operation. 
            {
                int temp = arr[i][j]; 
                arr[i][j] = arr[j][i];
                arr[j][i] = temp; 
            }
        }

        // Reverse Each Row
        for(int i = 0; i < arr.length; i++)
        {
            ArrayUtils.reverseArray(arr[i], 0, arr.length);
        }
    }
    
    public static void main(String[] args) {
        // n x n
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        rotate(arr);

        System.out.println(Arrays.deepToString(arr));
    }
}
