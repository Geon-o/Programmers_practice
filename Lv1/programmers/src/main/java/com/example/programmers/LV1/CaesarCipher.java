package com.example.programmers.LV1;

public class CaesarCipher {
    public static void main(String[] args) {
        String s = "z";
        int n = 1;

        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                answer += c;
                continue;
            }

            if (c >= 'a' && c <= 'z') {
                if (c + n > 'z'){
                    answer += (char)(c - 26 + n);
                } else {
                    answer += (char)(c + n);
                }
            } else if (c >= 'A' && c <= 'Z') {
                if (c + n > 'Z'){
                    answer += (char) (c - 26 + n);
                } else {
                    answer += (char) (c + n);
                }
            }
        }
        return answer;
    }
}
