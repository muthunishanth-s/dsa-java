package arrays_1d_2d.easy;

import java.util.Arrays;

public class LeftRotateArrayByOne {

    static void leftRotate(int[] arr)
    {
        int temp = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args) {
        
        int[] arr = {4, 5, 3, 9, 10};

        leftRotate(arr);

        System.out.println(Arrays.toString(arr));
    }
}
