package com.example.programmers;

import java.util.Arrays;

public class CommonMultiple {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;

        System.out.println(Arrays.toString(solution(n, m)));
    }

    public static int[] solution(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);

        while (min != 0) {
            int r = max % min;
            max = min;
            min = r;
        }

        int gcd = n * m / max;

        int[] answer = {max, gcd};
        return answer;
    }
}
