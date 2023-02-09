package com.example.programmers.Lv0;

import java.util.Arrays;

public class MiddleValue {
    public static void main(String[] args) {
        int[] array = {9,-1,0};
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer = array[array.length / 2];

        return answer;
    }
}
