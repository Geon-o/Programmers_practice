package com.example.programmers.LV1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;

        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int remainingBudget = budget;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if (d[i] > remainingBudget) {
                break;
            } else {
                remainingBudget -= d[i];
                answer++;
            }
        }

        return answer;
    }
}
