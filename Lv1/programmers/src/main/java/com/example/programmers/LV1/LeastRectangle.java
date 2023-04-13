package com.example.programmers.LV1;

import java.util.Arrays;

public class LeastRectangle {
    public static void main(String[] args) {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};

        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        int xMax = sizes[0][0];
        int yMax = sizes[0][1];

        for (int i = 0; i < sizes.length; i++) {
            if (xMax < sizes[i][0]) {
                xMax = sizes[i][0];
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            for (int j = 1; j < sizes[0].length; j++) {
                if (yMax < sizes[i][j]) {
                    yMax = sizes[i][j];
                }
            }
        }

        answer = xMax * yMax;

        return answer;
    }
}
