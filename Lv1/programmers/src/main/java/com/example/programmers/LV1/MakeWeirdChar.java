package com.example.programmers.LV1;

public class MakeWeirdChar {
    public static void main(String[] args) {
        String s = "try hello world";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] word = s.split("");
        int indexNum = 0;

        for (String loopStr : word) {
            indexNum = loopStr.contains(" ") ? 0 : indexNum+1;
            answer.append(indexNum % 2 == 0 ? loopStr.toLowerCase() : loopStr.toUpperCase());
        }
        return answer.toString();
    }
}


/**
 * 문제를 제대로 파악하지 못해 해결하기까지 오래걸렸던 문제
 * 문제에서는 각 단어는 하나 이상의 공백문자로 구분되어 있다는 조건이 포인트
 */