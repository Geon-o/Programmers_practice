package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class FindPrime {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        /**
         * 에라토스테네스의 체 알고리즘을 사용하여 소수를 구했다.
         * -> 소수가 되는 수의 배수를 지우면 남은 건 소수가 된다 라는 알고리즘
         *
         * 소수가 무엇인지 찾을 필요가 없기때문에 성능이 좋다.
         */
        List<Boolean> list = new ArrayList<>();
        int answer = 0;

        /**
         * 0번째와 첫번째는 false를 넣어주고
         * 나머지 두번째부터 true를 넣어준다.
         * -> [false, false, true, true, true, true]
         */
        list.add(false);
        list.add(false);
        for (int i = 2; i < n + 1; i++) {
            list.add(true);
        }

        /**
         * n이 10일 때 Math.sqrt(n)의 값은 3.1622776601683795로
         * 정수 3이된다.
         * if문에서는 i의 배수의 인덱스에 false를 넣도록 설정
         */
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (list.get(i)) {
                for (int j = i * i; j <= n ; j+=i) {
                    list.set(j, false);
                }
            }
        }

        /**
         * 모든 과정이 끝나면 list에 담긴 값 중에서 true 일경우에만 answer값을 증가시키도록 함
         */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)) {
                answer++;
            }
        }

        return answer;
    }
}
