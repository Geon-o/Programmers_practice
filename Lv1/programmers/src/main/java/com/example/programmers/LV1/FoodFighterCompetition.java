package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class FoodFighterCompetition {
    public static void main(String[] args) {
        int[] food = {1, 3, 4, 6};

        System.out.println(solution(food));
    }

    public static String solution(int[] food) {
        String answer = "";
        List<Integer> foodCountStorage = new ArrayList();

        /**
         * food의 첫번째 요소는 제외하고 나머지 요소에 접근하여 food[i]번째가 짝수이면 2로 나누고
         * 짝수가 아니라면 1을 빼고 2를 나눠준값을 foodCountStorage에 담아준다.
         */
        for (int i = 1; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                foodCountStorage.add((food[i] - 1) / 2);
            } else {
                foodCountStorage.add(food[i] / 2);
            }
        }

        /**
         * foodCountStorage의 크기만큼 루프를 돌며 foodCountSotrage의 각 인덱스에 담긴 값만큼 또 루프를 돌아준다.
         * 돌면서 인덱스 + 1 을 answer변수에 대입한다.
         */
        for (int i = 0; i < foodCountStorage.size(); i++) {
            for (int j = 0; j < foodCountStorage.get(i); j++) {
                answer += i + 1;
            }
        }

        /**
         * foodCountStorage의 크기와 food 를 -1한 크기가 매번 같다는걸 이용하여
         * answer에 0을 추가한 후 foodCountStorage에 담긴 값을 반대로 접근하여
         * answer에 대입한다.
         */
        if (foodCountStorage.size() == food.length - 1) {
            answer += 0;

            for (int i = foodCountStorage.size() - 1; i >= 0 ; i--) {
                for (int j = 0; j < foodCountStorage.get(i); j++) {
                    answer += i + 1;
                }
            }
        }
        return answer;
    }
}
