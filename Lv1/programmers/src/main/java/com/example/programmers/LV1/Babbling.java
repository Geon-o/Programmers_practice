package com.example.programmers.LV1;

public class Babbling {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        System.out.println(solution(babbling));

    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] filter = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            for (String f : filter) {
                /**
                 * 문제에 연속해서 같은 발음을 하는것을 어려워 한다고 했으니
                 * 같은 발음이 되는걸 contains로 확인 후 넘긴다.
                 */
                if (s.contains("ayaaya") || s.contains("mama") || s.contains("yeye") || s.contains("woowoo")) {
                    continue;
                } else {
                    /**
                     * 같은 발음이 아닐경우 filter에 담긴 문자열을 하나씩 가져와 replace로
                     * s에 담긴 문자열에 존재할경우 공백으로 변경
                     */
                    s = s.replace(f, " ");
                }
            }
            /**
             * 모두 공백으로 변경됐을 경우 공백도 없에버리고
             * s가 아무것도 없을 때 answer값을 증가
             */
            s = s.replace(" ", "");
            if (s.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
