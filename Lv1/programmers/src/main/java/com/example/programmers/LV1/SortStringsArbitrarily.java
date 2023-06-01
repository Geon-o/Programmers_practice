package com.example.programmers.LV1;

import java.util.Arrays;

public class SortStringsArbitrarily {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(Arrays.toString(solution(strings, n)));
    }

    public static String[] solution(String[] strings, int n) {

        /**
         * 먼저 배열안에 문자열들의 n번째 위치의 문자를 빼기위해 charAt을 사용하여 추출함
         * 추출 후 Arrays.sort를 하기 위해 기존 strings에 첫번째에 추출한 문자를 붙여준 후
         * 다시 strings에 넣어줌
         */
        for (int i = 0; i < strings.length; i++) {
            String tmp = String.valueOf(strings[i].charAt(n));
            strings[i] = tmp + strings[i];
        }

        /**
         * 다시 정의된 strings 배열값을 sort로 정렬함
         */
        Arrays.sort(strings);

        /**
         * 정렬 후 루프를 돌면서 앞에 붙여놓은 문자를 제거하기 위해
         * substring을 1로 고정
         */
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}
