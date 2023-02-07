package com.example.programmers.Lv0;

import java.util.Arrays;

public class Division {
    public static void main(String[] args) {
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;

        System.out.println(Arrays.toString(solution(numer1, denom1, numer2, denom2)));
    }

    public static int[] solution(int numer1,int denom1, int numer2, int denom2) {
        //최대 공약수를 구해야함
        int[] answer = new int[2];

        int numer = (denom1 * numer2) + (denom2 * numer1);
        int denom = denom1 * denom2;
        int max = gcd(numer, denom);

        answer[0] = numer / max;
        answer[1] = denom / max;

        return answer;
    }

    public static int gcd(int numer, int denom) {
        //최대공약수 로직
        if (numer % denom == 0) {
            return denom;
        }
        //재귀함수
        return gcd(denom, numer % denom);
    }
}
