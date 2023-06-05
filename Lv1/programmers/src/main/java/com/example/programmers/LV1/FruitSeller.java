package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruitSeller {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        System.out.println(solution1(k, m, score));
    }

    /**
     * ArrayList를 사용한 코드
     */
    public static int solution1(int k, int m, int[] score) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }
        Collections.sort(list);

        /**
         * 오롬차순으로 정렬할땐 문제가 생기지 않는다.
         * 하지만 내림차순으로 다시 정렬 시 시간초과가 되면서 통과하지 못한다.
         */
        Collections.sort(list, Collections.reverseOrder());

        while (!(list.size() < m)) {
            if (list.subList(0, m).size() == m) {
                answer += Collections.min(list.subList(0, m)) * m;
            }
            list.subList(0,m).clear();
        }

        /**
         * 개선한 코드
         * 내림차순으로 정렬하지 않고 오름차순으로 정렬된 상태에서
         * 맨 뒤에 요소부터 m개씩 가져오도록 변경하였다.
         */
        while (!(list.size() < m)) {

            if (list.subList(list.size() - m, list.size()).size() == m) {
                answer += Collections.min(list.subList(list.size() - m, list.size())) * m;
            }
            list.subList(list.size() - m, list.size()).clear();
        }

        return answer;
    }

    /**
     * ArrayList를 사용하지 않고 해결한 코드
     */
    public static int solution2(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        int box = score.length - m;

        while (!(box < 0)) {
            answer += score[box] * m;
            box -= m;
        }

        return answer;
    }
}
