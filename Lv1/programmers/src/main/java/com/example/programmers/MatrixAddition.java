package com.example.programmers;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1},
                {2}
        };

        int[][] arr2 = {
                {3},
                {4}
        };

        System.out.println(Arrays.deepToString(solution(arr1, arr2)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        int arrSum = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j] + "+" + arr2[i][j] + "=" + (arr1[i][j] + arr2[i][j]));
                arrSum = arr1[i][j] + arr2[i][j];


                answer[i][j] += arrSum;
            }
        }
        return answer;
    }
}
