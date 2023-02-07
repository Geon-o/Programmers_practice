package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DivisionNumArr {

    public static List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
                count++;
            }
        }
        answer.sort(Comparator.naturalOrder());

        if (count == 0) {
            answer.add(-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(solution(arr, divisor));

    }
}