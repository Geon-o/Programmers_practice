package com.example.programmers.LV1;

public class ColatzGuess {
    public static void main(String[] args) {
        long n = 16;
        System.out.println(solution(n));
    }

    public static int solution(long num) {
        int answer = 0;
        long currentNum = num;

        while (currentNum != 1) {

            if (currentNum % 2 == 0) {
                currentNum /= 2;
                answer++;

            } else if (currentNum % 2 != 0) {
                currentNum = currentNum * 3 + 1;
                answer++;
            }

            if (answer == 500) {
                return -1;
            }
        }
        return answer;
    }
}
