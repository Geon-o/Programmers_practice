package com.example.programmers;

public class Password {
    public static void main(String[] args) {
        String s = "ybcde";
        String skip = "az";
        int index = 1;

        System.out.println(solution(s, skip, index));
    }

    public static String solution(String s, String skip, int index) {
        String answer = "";

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < index; j++) {
                do {
                    chars[i]++;
                    if (chars[i] > 'z') {
                        chars[i] -= 26;
                    }
                } while (skip.contains(String.valueOf(chars[i])));
            }
        }
        answer = String.valueOf(chars);

        return answer;
    }
}
