package com.example.programmers.LV1;

public class DotProduct {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        System.out.println(solution(a, b));
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                answer += (a[i]) * b[i];
            } else if (b[i] < 0) {
                answer += a[i] * (b[i]);
            } else {
                answer += a[i] * b[i];
            }
        }
        return answer;
    }
}
