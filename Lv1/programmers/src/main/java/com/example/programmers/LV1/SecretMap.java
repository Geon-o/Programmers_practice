package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecretMap {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
        long estimatedTime = System.currentTimeMillis() - startTime;

        System.out.println("걸린 시간 : " + estimatedTime/1000.0 + " milli seconds");
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        /**
         * 숫자가 들어있는 배열들을 2진수로 변환하고 비교하기위해 List 변수 2개를 만듦
         */
        List<String> arr1List = new ArrayList<>();
        List<String> arr2List = new ArrayList<>();

        /**
         * 생성한 List 변수에 2진수로 변경된 값들을 넣음
         */
        for (int i = 0; i < arr1.length; i++) {
            arr1List.add(i, String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr1[i]))));
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2List.add(i, String.format("%0" + n + "d", Long.parseLong(Long.toBinaryString(arr2[i]))));
        }

        /**
         * 원하는 형식의 문자열을 만들기 위한 변수 지정
         */
        String successMap = "";

        /**
         * 핵심로직
         *
         * 2중 for문으로 루프를 돌면서 charAt으로 한글자 씩 비교하여
         * 둘다 "1"이 있다면 successMap 변수에 해당하는 문자를 추가하도록 함
         *
         * 하나의 요소끼리 비교가 끝났다면 successMap에 담긴 값을 answer배열에 넣어주도록하고
         * successMap의 기존 값을 제거하기 위해 successMap의 길이가 n과 같으면 초기화 해주도록함
         */
        for (int i = 0; i < arr1List.size(); i++) {
            for (int j = 0; j < n; j++) {
                if (Character.toString(arr1List.get(i).charAt(j)).equals("1") ||
                        Character.toString(arr2List.get(i).charAt(j)).equals("1")){

                    successMap += "#";
                } else {
                    successMap += " ";
                }
            }
            answer[i] = successMap;

            if (successMap.length() == n) {
                successMap = "";
            }
        }


        return answer;
    }

    /**
     * 문제해결을 했지만 코드가 지져분하며
     * charAt으로 비교와 많은 for문의 사용으로
     * 성능이 떨어짐
     *
     * -예시로 다른사람 코드를 참고(간결함)-
     * String[] result = new String[n];
     *         for (int i = 0; i < n; i++) {
     *             result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
     *         }
     *
     *         for (int i = 0; i < n; i++) {
     *             result[i] = String.format("%" + n + "s", result[i]);
     *             result[i] = result[i].replaceAll("1", "#");
     *             result[i] = result[i].replaceAll("0", " ");
     *         }
     * */
}
