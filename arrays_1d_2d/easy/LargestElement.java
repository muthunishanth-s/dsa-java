
/*
    Largest Element in Array

    input:  Array = {56, 76, 33, 20, 9}

    Output = 76
    
*/

package arrays_1d_2d.easy;

public class LargestElement {

    static int getMaxElement(int[] arr)
    {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        return max;

        // Time Complexity - O(n)
        // Space Complexity - O(1)
    }

    public static void main(String args[])
    {
        int arr[] = {56, 76, 33, 20, 9};

        System.out.println(getMaxElement(arr));
    }
}
