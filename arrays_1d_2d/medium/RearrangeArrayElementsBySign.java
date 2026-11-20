package arrays_1d_2d.medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    static int[] rearrangeArrayElementsBySign(int[] arr)
    {
        int size = arr.length;
        int[] answer = new int[size];

        int evenIndex = 0; // For +ve Element
        int oddIndex = 1; // For -ve Element

        for(int i=0; i<size; i++)
        {
            if(arr[i] >= 0)
            {
                answer[evenIndex] = arr[i];
                evenIndex += 2;
            }
            else 
            {
                answer[oddIndex] = arr[i];
                oddIndex += 2;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, -1, -3, -4, 2, 3};

        System.out.println(Arrays.toString(rearrangeArrayElementsBySign(arr)));
    }
}
