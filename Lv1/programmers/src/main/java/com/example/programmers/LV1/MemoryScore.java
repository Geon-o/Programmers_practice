package com.example.programmers.LV1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
    public static void main(String[] args) {
        String[] name = {"kali", "mari", "don"};
        int[] yearning = {11, 1, 55};
        String[][] photo = {
                {"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}
        };

        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        /**
         * Map을 활용한 코드
         *
         * 처음에 Map을 사용하여 name에 따른 value 값을 넣어 한꺼번에 관리하려고 했지만
         * Map의 key와 photo에 들어있는 사람의 이름을 어떻게 매칭시키고 매칭시킨 후 value 값을
         * 어떻게 꺼내와야하는지 잘 모르겠어서 시도하려다가 멈춘 코드
         *
         * 해결
         * getOrDefault() 메소드를 사용하여 간단히 해결
         * 찾는키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메소드
         *
         * 느낀점
         * 클래스들이 가지고 있는 메소드를 잘 인지하고 있으면 더욱 빠르고 정확하게
         * 코드를 설계할 수 있겠다
         */
        Map<String, Integer> personScore = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            personScore.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                answer[i] += personScore.getOrDefault(photo[i][j], 0);
            }
        }


        /**
         * 프로그래머스에 제출한 코드
         * 과도한 for문 사용으로 보기 불편함
         */
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < photo.length; j++) {
                for (int k = 0; k < photo[j].length; k++) {
                    if (name[i].equals(photo[j][k])) {
                        answer[j] += yearning[i];
                    } else {
                        answer[j] += 0;
                    }
                }
            }
        }

        return answer;
    }
}
