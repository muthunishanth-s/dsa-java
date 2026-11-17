package arrays_1d_2d.easy;

public class SecondLargest {

    static int secondLargestElement(int[] arr)
    {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            if(firstLargest < arr[i])
            {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(secondLargest < arr[i] && arr[i] != firstLargest)
            {
                secondLargest = arr[i];
            }
        }

        return secondLargest;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }

    public static void main(String[] args)
    {
        int arr[] = {56, 76, 33, 20, 9};

        int secondLargest = secondLargestElement(arr);

        if(secondLargest == Integer.MIN_VALUE)
            System.out.println("No second largest element");
        else
            System.out.println(secondLargest);
    }
}
