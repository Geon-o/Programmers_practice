package com.example.programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumbersSpacedByX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long x = Long.parseLong(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        System.out.println(Arrays.toString(solution(x, n)));
    }

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        long defaultSumNum = x;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = x;
            x += defaultSumNum;
        }
        return answer;
    }
}
