package com.training.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] row = new Integer[i + 1];
            int middleInd = i / 2;
            int element = 1;
            for (int j = 0; j <= middleInd; j++) {
                if (j > 0) {
                    Integer right = triangle.get(i - 1).get(j);
                    Integer left = triangle.get(i - 1).get(j - 1);
                    element = right + left;
                }
                row[j] = element;
                row[i - j] = element;
            }
            triangle.add(i, Arrays.asList(row));
        }
        return triangle;
    }
}
