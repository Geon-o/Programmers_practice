package com.example.programmers.LV1;

import java.util.*;

public class FailureFate {
    public static void main(String[] args) {
        final int N = 2;
        int[] stages = {1, 1, 1, 1};

        System.out.println(Arrays.toString(solution(N, stages)));

    }

    public static int[] solution(int N, int[] stages) {
        /**
         * 카카오 코딩테스트여서 그런지 난이도가 상당했던 테스트
         * 중간에 너무 꼬이기도하고 다른 테스트 케이스에서 문제가 발견됐을 때
         * 어떤 상황까지 염두해야하는지 잘 모르겠어서 내 자신의 한계를 알게되었다.
         *
         * 코드는 다른 사람이 작성한 코드를 많이 참고해서 디버그 해보며 돌려보는 식으로 진행하였다.
         * 프로그래머스 해당 테스트에서 코드 실행 시 1번 예시문에 대해선 잘 출력하였지만. 2번 예시문에서 막혔다.
         *
         * 조금 더 많이 공부해야겠다.
         */
        int[] answer = new int[N];
        List<Integer> list = new ArrayList<>();
        Map<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < stages.length; i++) {
            list.add(stages[i]);
        }

        for (int i = 1; i <= N; i++) {
            double count = 0d;
            double currentStage = 0d;

            for (int j = 0; j < list.size(); j++) {

                if (i <= list.get(j)) {
                    count++;
                }

                if (i == list.get(j)) {
                    currentStage++;
                }
            }
            if(count == 0 && currentStage == 0) count = 1;
            map.put(i, currentStage / count);
        }

        for (int i = 0; i < N; i++) {
            double maxValue = -1;
            int indexValue = 0;

            for (int key : map.keySet()) {
                if (maxValue < map.get(key)) {
                    maxValue = map.get(key);
                    indexValue = key;
                }
            }
            answer[i] = indexValue;
            map.remove(indexValue);
        }

        return answer;
    }
}
