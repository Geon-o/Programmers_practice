package com.example.programmers.Lv0;

import java.util.ArrayList;
import java.util.List;

public class NotEvenNum {

    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer.add(i);
            }
        }

        return answer;
    }
}
