package com.example.programmers.LV1;

public class MakePrime {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        /**
         * 먼저 3개의 숫자를 더하기 위해 각각의 인덱스 자리를 3중 for문을 사용하여
         * 값을 더해준다.
         *
         * 더한 값은 selectPrime 메소드에서 처리해준다.
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (selectPrime(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    public static boolean selectPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
