package com.example.programmers.LV1;

import java.util.*;

public class DartGame {
    public static void main(String[] args) {
        String dartResult = "1S2D*3T";

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3]; //점수가 담길 배열
        int idx = 0; // 점수가 담길 배열에 접근하고자하는 index 값
        StringBuffer str = new StringBuffer("");// dartResult.charAt()으로 가져온 문자를 담을 변수

        // 루프를 돌면서 dartResult의 문자를 하나씩 가져옴
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            // 가져온 문자를 비교
            switch (c) {
                case 'S' -> {
                    //arr[idx]에 제곱하여 값을 넣어줌
                    arr[idx] = (int) Math.pow(Integer.parseInt(str.toString()), 1);
                    idx++; // 다음 인덱스에 담기위해 증가시켜줌
                    str = new StringBuffer(); // 다음 숫자를 받기 위해 초기화
                }

                // 위와 같음
                case 'D' -> {
                    arr[idx] = (int) Math.pow(Integer.parseInt(str.toString()), 2);
                    idx++;
                    str = new StringBuffer();
                }
                // 위와 같음
                case 'T' -> {
                    arr[idx] = (int) Math.pow(Integer.parseInt(str.toString()), 3);
                    idx++;
                    str = new StringBuffer();
                }
                /**
                 * '* 이 중복으로 나타날 수 있음을 고려하여
                 * 먼저 *의 이전 점수에 2를 곱해주고
                 * idx 즉 arr배열에 2번째에도 값이 있냐를 확인 후
                 * 있다면 arr배열의 idx - 2의 번째에도 2를 곱해줌
                 */
                case '*' -> {
                    arr[idx - 1] *= 2;
                    if (idx > 1) {
                        arr[idx - 2] *= 2;
                    }
                }
                case '#' -> arr[idx - 1] *= -1;

                // 두자리 숫자가 들어올 수 있으므로 append를 통해 붙여줌
                default -> str.append(c);
            }
        }

        System.out.println(Arrays.toString(arr));

        /**
         * 모든 계산이 끝난 이후 arr의 배열의 값을 차례데로 가져와
         * answer에 더해줌
         */
        for (int num : arr){
            answer += num;
        }

        return answer;
    }
}
