package com.example.programmers.LV1;

import java.util.*;

public class PickTwoAndAdd {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};

        System.out.println(Arrays.toString(solution(numbers)));
    }

    public static Integer[] solution(int[] numbers) {
        Integer[] answer = {};
        int pickOneNum = 0;
        List<Integer> arrayAfterRemove = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            pickOneNum = numbers[i];

            for (int j = 0; j < numbers.length; j++) {
                arrayAfterRemove.add(numbers[j]);
            }

            arrayAfterRemove.remove(i);

            for (int j = 0; j < arrayAfterRemove.size(); j++) {
                set.add(pickOneNum + arrayAfterRemove.get(j));
            }
            arrayAfterRemove.clear();
        }

        answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);

        return answer;
    }
}
