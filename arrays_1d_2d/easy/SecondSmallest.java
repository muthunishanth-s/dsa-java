package arrays_1d_2d.easy;


public class SecondSmallest {

    static int secondSmallestElement(int[] arr)
    {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < firstSmallest)
            {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }
            else if(arr[i] < secondSmallest && arr[i] != firstSmallest)
            {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args)
    {
        int arr[] = {56, 76, 33, 20, 9};

        int secondSmallest = secondSmallestElement(arr);

        if(secondSmallest == Integer.MAX_VALUE)
            System.out.println("No Second Smallest Element Present");
        else
            System.out.println(secondSmallest);
    }
}
