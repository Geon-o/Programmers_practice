package com.example.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {

        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        System.out.println(Arrays.toString(solution(lottos, win_nums)));

    }

    public static int[] solution(int[] lottos, int[] win_nums){
        int[] answer = new int[2];
        List<Integer> lottoNum = new ArrayList<>();
        List<Integer> win_num = new ArrayList<>();

        int zero = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
            } else {
                lottoNum.add(lottos[i]);
            }
        }

        for (int i = 0; i < win_nums.length; i++) {
            win_num.add(win_nums[i]);
        }

        lottoNum.retainAll(win_num);

        int max = lottoNum.size() + zero;
        int min = lottoNum.size();

        answer[0] = selectRank(max);
        answer[1] = selectRank(min);
        return answer;
    }

    public static int selectRank(int matchingNum) {
        return switch (matchingNum) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
