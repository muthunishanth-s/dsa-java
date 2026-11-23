package arrays_1d_2d.easy;

import java.util.Arrays;
import toolkit.ArrayUtils;

public class MoveZerosToEnd {

    static void moveZeros(int[] arr)
    {
        int j = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                ArrayUtils.swapArrayElement(arr, i, j);
                j += 1;
            }
        }

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 0, 0, 4, 5, 0, 6, 0, 9};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
