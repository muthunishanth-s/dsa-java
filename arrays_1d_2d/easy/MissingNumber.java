package arrays_1d_2d.easy;

public class MissingNumber {

    static int missingNumber(int[] arr, int n)
    {
        int xor1 = 0, xor2 = 0;

        for(int i=0; i<n-1; i++)
        {
            xor1 = xor1 ^ arr[i]; // xor of Array Elements

            xor2 = xor2 ^ (i + 1); // xor of 1 to n-1 elements
        }

        xor2 = xor2 ^ n; // xor for 1 to n elements

        return xor1 ^ xor2;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 5, 6};
        int n = arr.length + 1;

        System.out.println(missingNumber(arr, n));
    }
}
