package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HateSameNum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> tmpList = new ArrayList<>();
        /**
         * 정수 0보다 크거나 같고 9보다 작거나 같은 수의 조건으로
         * 영향받지 않을 숫자를 넣음
         */
        int tmpNum = 10;

        /**
         * for 문을 돌면서 solution의 인자로 받은 arr 배열의 숫자를 차례대로 꺼내고
         * if문을 통해 초기 if문을 만났을 시 tmpNum의 값과 비교하여 arr의 맨 처음 즉 0번째에 위치한
         * 값을 List로 정의한 tmpList에 추가해주고, tmpNum은 arr[o]의 값으로 변경해줌으로써
         * 같은 숫자를 찾아낼 수 있음
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != tmpNum) {
                tmpList.add(arr[i]);
                tmpNum = arr[i];
            }
        }

        /**
         * 중복된 숫자가 모두 제거된 tmpList의 값들을
         * 배열 answer에 옮기는 작업
         */
        answer = new int[tmpList.size()];
        for (int i = 0; i < tmpList.size(); i++) {
            answer[i] = tmpList.get(i);
        }

        return answer;
    }
}
