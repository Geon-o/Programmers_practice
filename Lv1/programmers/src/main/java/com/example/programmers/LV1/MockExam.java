package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class MockExam {
    public static void main(String[] args) {
        int[] answers = {1, 3, 2, 4, 2};

        System.out.println(solution(answers));
    }

    public static List<Integer> solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
        int[] score = new int[3];
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % first.length]) {
                score[0]++;
            }
            if (answers[i] == second[i % second.length]){
                score[1]++;
            }
            if (answers[i] == third[i % third.length]){
                score[2]++;

            }
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

        if (maxScore == score[0]) {
            answer.add(1);
        }
        if (maxScore == score[1]) {
            answer.add(2);
        }
        if (maxScore == score[2]) {
            answer.add(3);
        }

        return answer;
    }
}
