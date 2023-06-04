package com.example.programmers.LV1;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        /**
         * 문제를 제대로 파악하지 못해 어렵게 느껴쪗던 문제
         *
         * 요지는 nums에 몇개가 들어있든 중복되는 값을 제거하고
         * 제거한 요소들의 갯수와 nums.length/2의 크기를 비교하여
         * 처리하는 문제
         *
         * 경우의 수를 구하려고했던게 잚못된 판단
         *
         * 어찌됐던 가져올 수 있는 최대의 숫자갯수는 nums.length/2 크기
         *
         */
        int answer = 0;
        Set<Integer> pick = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            pick.add(nums[i]);
        }

        /**
         * 핵심 로직
         * 어찌됐든 최대값은 nums.length/2로 고정이 된 상태
         * 그럼 중복이 제거된 pick의 크기랑 비교해서 처리하면 됨
         */
        if (pick.size() > nums.length/2) {
            answer = nums.length/2;
        } else {
            answer = pick.size();
        }

        return answer;
    }
}
