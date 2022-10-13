package com.example.programmers;

public class CalcAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {
        double answer = 0;
        int arrTmp = 0;

        for (int i = 0; i < arr.length; i++) {
            arrTmp += arr[i];
        }
        return answer = (double)(arrTmp) / arr.length;
    }
}
