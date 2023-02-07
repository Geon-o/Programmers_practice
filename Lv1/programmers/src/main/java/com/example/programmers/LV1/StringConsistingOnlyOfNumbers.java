package com.example.programmers.LV1;

public class StringConsistingOnlyOfNumbers {

    public static void main(String[] args) {
        String s = "09786A";

        System.out.println(solution(s));
    }

    public static Boolean solution(String s) {
        boolean answer = true;

        boolean stringLen = (s.length() == 4 || s.length() == 6);

        if (stringLen) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch >= '0' && ch <= '9') {
                    answer = true;
                }
                else {
                    answer = false;
                    break;
                }
            }
        }
        else {
            answer = false;
        }
        return answer;
    }
}
