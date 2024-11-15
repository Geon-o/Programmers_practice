package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class MakeHamburger {
    public static void main(String[] args) {
        /**
         * 1 : 빵
         * 2 : 야채
         * 3 : 고기
         *
         * 하나의 햄버거가 만들어지는 조건은 1231 순서 즉 빵 / 야채 / 고기 / 빵
         * 이 순서여야지만 햄버거가 완성됨
         */
        int[] ingredients = {1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1};

        System.out.println(solution(ingredients));

    }

    public static int solution(int[] ingredient) {
        int answer = 0;
        int[] hamburgerForm = {1, 2, 3, 1};
        List<Integer> chooseIngredient = new ArrayList<>();

        for (int j : ingredient) {
            chooseIngredient.add(j);

            if (chooseIngredient.size() >= 4) {
                if ((hamburgerForm[0] == chooseIngredient.get(chooseIngredient.size() - 4)) &&
                        (hamburgerForm[1] == chooseIngredient.get(chooseIngredient.size() - 3)) &&
                        (hamburgerForm[2] == chooseIngredient.get(chooseIngredient.size() - 2)) &&
                        (hamburgerForm[3] == chooseIngredient.get(chooseIngredient.size() - 1))) {
                    answer++;

                    for (int i = 0; i < 4; i++) {
                        chooseIngredient.remove(chooseIngredient.size() - 1);
                    }
                }
            }
        }
        return answer;
    }
}
