package arrays_1d_2d.medium;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {

    static List<Integer> intersectionOfTwoSorteddArrays(int[] arr1, int[] arr2)
    {
        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j]) i++;
            else if(arr1[i] > arr2[j]) j++;
            
            else
            {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }

        return result; // Duplicates are Allowed in Intersection

        // Time Complexity: O(m + n)
        // Space Complexity: O(min(m,n))
    }
    
    public static void main(String[] args) {
        
        // Sorted Array
        int[] arr1 = {1, 1, 2, 3, 4, 5, 5}; 
        int[] arr2 = {1, 3, 3, 7, 9};

        System.out.println(intersectionOfTwoSorteddArrays(arr1, arr2));
    }
}
