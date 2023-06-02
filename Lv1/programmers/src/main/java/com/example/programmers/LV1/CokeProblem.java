package com.example.programmers.LV1;

public class CokeProblem {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;

        System.out.println(solution(a, b, n));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;

        /**
         * while문으로 몫이 0보다 작을때까지 돌며
         * if문에 a의 배열이면 answer에 n/a의 몫만큼 병수를 곱해주고
         * n에는 n/a 목많큼 병수를 곱한 후 remain 값, 즉 n이 a로 나누어 떨어지지 않았을 때의 카운트 값으로
         * 더해주면 총 가지고 있는 병의 갯수가 되는거고 이후 remain을 초기화 진행
         */
        while (n/a > 0) {
            if (n % a == 0) {
                answer += (n / a) * b;
                n = (n / a) * b + remain;
                remain = 0;
            } else {
                remain++;
                n--;
            }
        }
        return answer;
    }
    /**
     * 요구사항을 제대로 파악하지 못해 오래걸렸던 문제
     * 요구사항 제대로 이해하기
     */
}
