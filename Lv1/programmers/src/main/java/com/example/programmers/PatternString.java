package com.example.programmers;

public class PatternString {

    public static String solution(int n) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            answer += i % 2 != 0 ? "박" : "수";
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(solution(n));
    }
}
