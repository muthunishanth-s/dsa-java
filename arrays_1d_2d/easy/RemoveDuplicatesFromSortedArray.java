package arrays_1d_2d.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicate(int[] arr)
    {
        int j = 0;
        for(int i=1; i<arr.length; i++)
        {
            if( arr[j] != arr[i])
            {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 2, 2, 3, 5, 5};

        int index = removeDuplicate(arr);

        System.out.println("Unique Count: " + index);
        System.out.println(Arrays.toString(Arrays.copyOf(arr, index)));
    }
}
