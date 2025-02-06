package org.day04.binarysearch.problem3;

import static org.day04.binarysearch.problem3.Search2DMatrix.searchMatrix;

public class main {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
