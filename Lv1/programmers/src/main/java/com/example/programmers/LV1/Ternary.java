package com.example.programmers.LV1;

public class Ternary {
    public static void main(String[] args) {
        int n = 45;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        int decimalNumber = n;
        String ternary = "";

        /**
         * decimalNumber에 초기값 n을 받도록 설정
         * while 문에서 decimalNumber가 0이 될떄까지 돌도록 조건 설정
         * while 문 안에서는 ternary에 decimalNumber & 3의 결과를 차례대로 넣고
         * deciamlNumber를 3으로 나뉜 값으로 재설정
         */
        while (decimalNumber != 0) {
            ternary += decimalNumber % 3;
            decimalNumber /= 3;
        }

        /**
         * n의 3진수가 담긴 ternary를 10진수로 변경하기 위한 로직
         * n진수를 10진수로 변경하기 위해 Integer.parseInt()를 사용
         */
        answer = Integer.parseInt(ternary, 3);

        return answer;
    }
}
