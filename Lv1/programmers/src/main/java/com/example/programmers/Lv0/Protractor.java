package com.example.programmers.Lv0;

public class Protractor {
    public static void main(String[] args) {
        int angle = 180;

        System.out.println(solution(angle));
    }

    public static int solution(int angle) {
        int answer = 0;

        return answer = angle > 0 && angle < 90 ? 1 :
                angle == 90 ? 2 : angle > 90 && angle < 180 ? 3 : angle == 180 ? 4 : 0;
    }
}

