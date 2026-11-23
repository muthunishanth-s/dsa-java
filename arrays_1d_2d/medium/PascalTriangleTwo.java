package arrays_1d_2d.medium;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleTwo {

    static List<Integer> getRow(int rowIndex)
    {
        if(rowIndex < 0) return new ArrayList<>();

        if(rowIndex == 0) return new ArrayList<>(List.of(1));

        List<Integer> prevRow = null;

        for(int i = 1; i <= rowIndex; i++)
        {
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for(int j = 1; j < i; j++)
            {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            row.add(1);

            prevRow = row;
        }

        return prevRow;
    }
    
    public static void main(String[] args) {
        int rowIndex = 3;

        System.out.println(getRow(rowIndex));
    }
}
