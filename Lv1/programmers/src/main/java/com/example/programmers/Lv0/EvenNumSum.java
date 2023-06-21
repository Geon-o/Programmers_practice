package com.example.programmers.Lv0;

public class EvenNumSum {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
