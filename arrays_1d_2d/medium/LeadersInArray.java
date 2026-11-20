package arrays_1d_2d.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    static List<Integer> leadersInArray(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for(int i = arr.length-1; i >= 0; i--)
        {
            if(arr[i] > max)
            {
                list.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(list);

        return list;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 5, 3, 1, 2};

        System.out.println(leadersInArray(arr));
    }
}
