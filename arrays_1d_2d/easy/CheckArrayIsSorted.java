package arrays_1d_2d.easy;

public class CheckArrayIsSorted {
    
    static boolean isSortedArray(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] < arr[i-1]) return false;
        }

        return true;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 5, 6, 8, 7, 9};

        System.out.println(isSortedArray(arr));
    }
}
