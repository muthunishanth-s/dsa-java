package arrays_1d_2d.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    static List<Integer> spiralOrder(int[][] arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int totalElements = row * col;
        List<Integer> answer = new ArrayList<>();

        int top = 0;
        int right = col - 1;
        int down = row - 1;
        int left = 0;

        int k = 1;

        while(k <= totalElements) {
            
            // left -> right
            for(int j = top; j <= right && k <= totalElements; j++)
            {
                answer.add(arr[top][j]);

                k++;
            }
            top++;

            // top -> down
            for(int j = top; j <= down && k <= totalElements; j++)
            {
                answer.add(arr[j][right]);

                k++;
            }
            right--;

            //right -> left
            for(int j = right; j >= left && k <= totalElements; j--)
            {
                answer.add(arr[down][j]);

                k++;
            }
            down--;

            // bottom -> top
            for(int j = down; j >= top && k <= totalElements; j--)
            {
                answer.add(arr[j][left]);

                k++;
            }
            left++;
        }

        return answer;

        // Time: \(O(row \times col)\)
        // Auxiliary Space: \(O(1)\)
        // Output Space: \(O(row \times col)\)
    }
    
    public static void main(String[] args) {
        
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(spiralOrder(arr));
    }
}
