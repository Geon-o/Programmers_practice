package com.example.programmers.Lv0;

public class Quotient {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 2;

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        int answer = 0;

        answer = num1 / num2;

        return answer;
    }
}
