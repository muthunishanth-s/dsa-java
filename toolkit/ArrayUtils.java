package toolkit;

public class ArrayUtils {
    public static void reverseArray(int[] arr, int start, int end)
    {
        end -= 1;

        while(start <= end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp; 

            start++;
            end--; 
        }
    }

    public static void swapArrayElement(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp; 
    }
}
