package com.example.programmers.LV1;

public class Reapply {
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int endPoint = 0;
        int answer = 0;

        for (int paintPoint : section) {
            if (paintPoint < endPoint) {
                continue;
            }
            answer++;
            endPoint = paintPoint + m;
        }

        return answer;
    }
}
