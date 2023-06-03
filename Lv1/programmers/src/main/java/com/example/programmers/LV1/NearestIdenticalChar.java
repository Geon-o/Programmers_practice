package com.example.programmers.LV1;

import java.util.*;

public class NearestIdenticalChar {
    public static void main(String[] args) {
        String s = "banana";

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int index = s.substring(0, i).lastIndexOf(s.charAt(i));

            if (index == -1) {
                answer[i] = index;
            } else {
                answer[i] = i - index;
            }
        }

        return answer;
    }
}
