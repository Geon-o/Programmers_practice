package com.example.programmers.LV1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Year2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;

        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        /**
         * LocalDate 클래스를 사용하여 날짜를 만들고
         * 만들 날짜를 기반으로 getDayOfWeek() 메소드를 사용하여
         * DayOfWeek 객체를 얻은 후 getDisplayName() 메소드를 사용
         * 요일을 영어로 넘겨받고 SHORT를 사용하여 요약된 요일로 표시하고 toUpperCase를 사용하여
         * 대문자로 변환
         *
         * 느낀점
         * 처음엔 switch-case 문을 사용하려했지만 무분별한 사용은
         * 가독성이 떨어질뿐더러 버그 발생률이 높아질거라 생각된다.
         * 그리하여 java에 내장된 라이브러리를 사용하여 가독성을 높혀
         * 수정하지 용이하도록 설계를 하는게 좋겠다라고 생각됨.
         *
         * 한편으론 각종 라이브러리를 사용하여 로직을 설계하는 것도 좋지만
         * 내부에서 어떻게 처리되는지 알고있으면 더 좋겠다.
         */
        String answer = "";

        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase();

        return answer;
    }
}
