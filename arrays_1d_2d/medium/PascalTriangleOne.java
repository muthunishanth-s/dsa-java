package arrays_1d_2d.medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleOne {

    static List<List<Integer>> generateTriangle(int rows)
    {
        if(rows == 0) return new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        if(rows >= 1)
        {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            answer.add(firstRow);
            
            if(rows == 1) return answer;
        }

        for(int i = 1; i < rows; i++)
        {
            List<Integer> row = new ArrayList<>(); 
            
            row.add(1);

            for(int j = 1; j < i; j++)
            {
                row.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
            }

            row.add(1);

            answer.add(row);
        }

        return answer;
    }
    
    public static void main(String[] args) {
        int n = 5;
        
        System.err.println(generateTriangle(n));
    }
}
