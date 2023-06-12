package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class KnightWeapon {
    public static void main(String[] args) {
        int knights = 10;
        int powerLimit = 3;
        int applyPowerToOverLimit = 2;

        System.out.println(solution(knights, powerLimit, applyPowerToOverLimit));
    }

    public static int solution(int knights, int powerLimit, int applyPowerToOverLimit) {
        int answer = 0;

        /**
         * calcDivisor()에서 넘겨받은 값으로 조건에 맞는지 확인 후
         * 조건값보다 크다면 answer에 applyPowerToOverLimit를 더해주고
         * 아니라면 그냥 calcDivisor에서 넘어온 값을 더해준다.
         */
        for (int i = 1; i <= knights; i++) {

            if (calcDivisor(i) > powerLimit) {
                answer += applyPowerToOverLimit;
            } else {
                answer += calcDivisor(i);
            }
        }

        return answer;
    }


    /**
     * 약수 구하는 알고리즘
     */
    public static int calcDivisor(int knight) {

        List<Integer> divisorCount = new ArrayList<>();

        /**
         * 매개값 knight를 받아 Math.sqrt(제곱)까지 루프를 돈다
         */
        for (int i = 1; i <= Math.sqrt(knight); i++) {
            // 작은 값을 list에 넣어준다.
            if (knight % i == 0) {
                divisorCount.add(i);

                // 큰 값을 list에 넣어준다.
                if (knight / i != i) {
                    divisorCount.add(knight / i);
                }
            }
        }

        return divisorCount.size();
    }
}
