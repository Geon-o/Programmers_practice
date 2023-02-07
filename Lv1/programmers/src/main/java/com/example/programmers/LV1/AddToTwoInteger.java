package com.example.programmers.LV1;

public class AddToTwoInteger {
    public static long solution(int a, int b) {
        long answer = 0;

        if (a < b) {
            for (int i = 0; true; i++) {
                answer += a++;

                if (a == b) {
                    answer += b;
                    break;
                }
            }
        } else if (a > b) {
            for (int i = 0; true; i++) {
                answer += a--;

                if (b == a) {
                    answer += a;
                    break;
                }
            }
        } else if (a == b) {
            return answer;
        }

        return answer;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        System.out.println(solution(a,b));
    }
}
