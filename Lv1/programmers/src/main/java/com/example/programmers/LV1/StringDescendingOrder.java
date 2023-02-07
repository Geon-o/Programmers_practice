package com.example.programmers.LV1;


import java.util.Arrays;

public class StringDescendingOrder {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        String answer = "";

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        answer = new StringBuilder(new String(charArr)).reverse().toString();
        return answer;
    }
}
