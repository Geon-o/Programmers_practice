package com.example.programmers.Lv0;

public class CompareNumbers {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(solution(num1, num2));
    }

    public static int solution(int num1, int num2) {
        int answer = 0;

        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }
}
