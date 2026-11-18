package arrays_1d_2d.medium;

public class MajorityElement_One {

    // Boyer-Moore-Algorithm
    static int majorityElement(int[] arr)
    {
        if(arr.length == 0) return -1;
        int count = 0;
        int element = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(count == 0)
            {
                element = arr[i];
            }
            
            if(element == arr[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }

        // check
        int countCheck = 0;
        for(int i=0; i<arr.length; i++) { if(element==arr[i]) countCheck++; }

        return countCheck > (arr.length / 2) ? element : -1;

        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
    public static void main(String[] args) {
        
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        System.out.println(majorityElement(arr));
    }
}
