package com.example.programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfDivisorsAndAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int left = scanner.nextInt();
        int right = scanner.nextInt();

        System.out.println(solution(left, right));
    }

    public static int solution(int left, int right) {
        int answer = 0;
        int count = 0;

        // 첫번째 코드(new)
        List<Integer> arr = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= left ; j++) {
                if (i % j == 0) {
                    arr.add(j);
                }
            }
            if (arr.size() % 2 == 0) {
                answer += i;
                arr.clear();
            }
            else {
                answer -= i;
                arr.clear();
            }
        }


        //두번째 코드(new 하지 않고 돌아가는 로직)
        for (int i = left; i <= right; i++) {
            for (int j = 1; j <= i ; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
                count = 0;
            }
            else {
                answer -= i;
                count = 0;
            }
        }

        return answer;
    }
    // 첫번째 코드와 두번째 코드를 돌려봤을 때
    // 지금은 그다지 성능차이가 크지 않지만
    // 첫번재 코드는 아무래도 new 연산자 때문에 무리가 갈 것으로 예상
}
