package com.example.programmers.LV1;

public class Trio {
    public static void main(String[] args) {
        int[] num = {-2, 3, 0, 2, -5};

        System.out.println(solution(num));
    }

    public static int solution(int[] num) {
        int answer = 0;

        for (int i = 0; i < num.length - 2; i++) {
            for (int j = i + 1; j < num.length -1; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
