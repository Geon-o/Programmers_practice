package com.example.programmers.Lv2;

public class MaxValueAndMinValue {
    public static void main(String[] args) {
        String s = "0 -1";

        System.out.println(solution(s));
    }

    public static StringBuilder solution(String s) {

        //기존 String 타입이였던 answer를 StringBuilder로 변경해주면서 성능을 고려함
        StringBuilder answer = new StringBuilder();
        /**
         * str배열에는 공백을 기준으로 문자열을 나눠 배열에 담아줌
         * numArr 배열에는 위에서 나눈 문자열의 배열을 정수로 담을 공간
         */
        String[] str = s.split(" ");
        int[] numArr = new int[str.length];

        // 문자열 배열의 값들은 정수로 변환하기 위한 작업
        for (int i = 0; i < str.length; i++) {
            numArr[i] = Integer.parseInt(str[i]);
        }

        // max와 min에 기준값을 넣어줌
        int max = numArr[0];
        int min = numArr[0];

        //루프를 돌면서 max와 min 값을 num으로 비교하면서 각 조건에 맞게 변수에 다시 알맞는 값을 넣는 로직
        for (int num : numArr) {

            if (max < (num)) {
                max = num;
            }

            if (min > num) {
                min = num;
            }
        }

        answer.append(min).append(" ").append(max);

        return answer;
    }
}
