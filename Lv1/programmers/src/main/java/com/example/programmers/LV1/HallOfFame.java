package com.example.programmers.LV1;

import java.util.*;

public class HallOfFame {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};

        System.out.println(Arrays.toString(solution(k, score)));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        /**
         * 생각보다 쉬웠던 문제
         * 처음에는 어떤식으로 k번째 숫자를 가져와야하는지 고민됨
         * 먼저 ArrayList로 score의 i번째 숫자를 가져와 넣어줌
         * 넣은 후 요구사항처럼 높은 점수는 항상 낮은 점수 앞에 있도록
         * Collections의 sort를 사용하여 reverseOrder를 사용하여 내림차순으로 변경
         * 변경 후 현재 list의 크기가 k보다 작을 경우
         * answer에 정렬된 list의 i번째 숫자를 가져오도록 함
         * 반대로 클 경우 list를 subList로 0~k 번째까지 잘라
         * k-1 인덱스를 가져와 answer에 넣어주도록 함
         *
         * 로직을 설계하는데는 큰 어려움은 없었으나 다른 사람들의 코드를 보았을 때
         * Queue를 사용해보는 것도 좋을 듯함.
         */
        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());

            if (list.size() < k) {
                answer[i] = list.get(i);
            } else {
                answer[i] = list.subList(0, k).get(k - 1);
            }
        }

        /**
         * Queue를 사용했을 경우
         * ⭐FIFO 구조
         */
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);

            if (queue.size() > k) {
                /**
                 * queue.poll
                 * - 큐 맨 앞에 있는 값 반환 후 삭제
                 * - 큐가 비어있을 경우 null 반환
                 */
                queue.poll();
            }

            /**
             * queue.peek
             * - 큐 맨앞에 있는 값 반환
             * - 비어있을 경우 null 반환
             */
            answer[i] = queue.peek();
        }

        return answer;
    }
}
