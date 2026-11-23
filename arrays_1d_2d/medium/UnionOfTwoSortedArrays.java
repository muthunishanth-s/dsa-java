package arrays_1d_2d.medium;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSortedArrays {

    static List<Integer> unionArrays(int[] arr1, int[] arr2)
    {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                if(result.isEmpty() || result.get(result.size()-1) != arr1[i])
                {
                    result.add(arr1[i]);
                }

                i++;
            }
            else if(arr1[i] > arr2[j])
            {
                if(result.isEmpty() || result.get(result.size()-1) != arr2[j])
                {
                    result.add(arr2[j]);
                }
                j++;
            }
            else
            {
                if(result.isEmpty() || result.get(result.size()-1) != arr1[i])
                {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            } 
        }

        // Remaining Numbers of arr1
        while(i < arr1.length){

            if(result.isEmpty() || result.get(result.size()-1) != arr1[i]) result.add(arr1[i]);

            i++;
        }

        // Remaining Numbers of arr2
        while (j < arr2.length) {

            if(result.isEmpty() || result.get(result.size()-1) != arr2[j]) result.add(arr2[j]);

            j++;
        }

        return result;

        // Time Complexity: O(m + n)
        // Space Complexity: O(m + n)
    }
    
    public static void main(String[] args) {
        
        // Sorted Array
        int[] arr1 = {1, 1, 2, 3, 4, 5, 5}; 
        int[] arr2 = {1, 3, 3, 7, 9};

        System.out.println(unionArrays(arr1, arr2));
    }
}
