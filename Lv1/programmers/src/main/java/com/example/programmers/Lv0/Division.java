package com.example.programmers.Lv0;

public class Division {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(solution(num1, num2));
    }

    public static int solution(float num1, float num2) {
        int answer = 0;
        float divisionNum;

        divisionNum = (num1 / num2);
        answer = (int) (divisionNum * 1000);

        return answer;
    }
}
