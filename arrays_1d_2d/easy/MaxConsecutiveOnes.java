package arrays_1d_2d.easy;

public class MaxConsecutiveOnes {

    static int maximumConsecutiveOnes(int[] arr)
    {
        int max = 0;
        int temp = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 1) 
            {
                temp++;
            }
            else
            {
                max = Math.max(temp, max);
                temp = 0; 
            }
        }

        return max;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1};

        System.out.println(maximumConsecutiveOnes(arr));

    }
}
