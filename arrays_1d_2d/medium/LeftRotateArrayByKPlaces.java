package arrays_1d_2d.medium;

import java.util.Arrays;
import toolkit.ArrayUtils;

public class LeftRotateArrayByKPlaces {

    public static void leftRotateArrayByKPlaces(int[] arr, int k)
    {
        int size = arr.length;
        k = k % size;

        ArrayUtils.reverseArray(arr, 0, k);
        ArrayUtils.reverseArray(arr, k, size);
        ArrayUtils.reverseArray(arr, 0, size);
    }
    
    public static void main(String[] args) {
        
        int arr[] = {5, 6, 3, 20, 9};
        int k = 3;

        leftRotateArrayByKPlaces(arr, k);

        System.out.println(Arrays.toString(arr));
    }
}
