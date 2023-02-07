package com.example.programmers.Lv0;

public class Remainder {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;

        System.out.println(solution(num1, num2));
    }

    //나머지 계산 로직
    public static int solution(int num1, int num2) {
        int answer = -1;

        answer = num1 % num2;

        return answer;
    }


}
