package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        /**
         * 초기에 설계했던 코드
         * 다 좋았지만 3번째 for문에서 문제가 생김
         *
         * 초기에는 다음과 같이 코드를 설계함.
         * if (cardsList1.get(0).equals(goal[i])) {
         *      cardsList1.remove(0);
         *      answer = "Yes";
         *
         *    } else  if (cardsList2.get(0).equals(goal[i])) {
         *      cardsList2.remove(0);
         *      answer = "Yes";
         *
         *    } else {
         *      answer = "No";
         *      break;
         *    }
         *
         * cardsList1과 cardsList2를 각 참조하면서
         * goal[i]와 같은 문자가 있다면 해당하는 list를 remove메소드를 통해 삭제해주는 과정으로
         * 잘 되나 싶었지만 IndexOutOfBoundsException이 발생하는 문제가 발생
         * 원인으로는 remove로 인해 둘중 한 list가 모두 비었을 때 만약 첫번째 if 문에서 false가 발생하였을 때
         * else if문에서 해당하는 list의 요소를 가져와야하는데 없으니 이와같은 예외가 발생하는걸로 판단.
         *
         * 그로인해 아래와 같이 코드를 변경함
         * list가 비어있는것도 확인하면서 goal[i]의 값과 list의 값이 같아야만하도록 설정
         *
         */
        String answer = "";
        List<String> cardsList1 = new ArrayList<>();
        List<String> cardsList2 = new ArrayList<>();

        for (int i = 0; i < cards1.length; i++) {
            cardsList1.add(cards1[i]);
        }

        for (int i = 0; i < cards2.length; i++) {
            cardsList2.add(cards2[i]);
        }

        for (int i = 0; i < goal.length; i++) {

            if (!(cardsList1.isEmpty()) && cardsList1.get(0).equals(goal[i])) {
                cardsList1.remove(0);
                answer = "Yes";

            } else  if (!(cardsList2.isEmpty()) && cardsList2.get(0).equals(goal[i])) {
                cardsList2.remove(0);
                answer = "Yes";

            } else {
                answer = "No";
                break;
            }
        }



        /**
         * 프로그래머스에 제출한 코드
         * 초기 코드에서 문제가 발생하여 찾아봤던 코드
         *
         * 0으로 초기화된 cards1Idx와 cards2Idx를 만들고
         *
         * goal의 길이만큼 루프를 돌면서
         * cards1과 cards2를 하나씩 참조하면서 goal[i]번째에 같은 문자가 있다면
         * 해당 문자가 있는 배열의 변수에 index(cards1Idx 또는 cards2Idx) 값을 하나씩 증가하도록 함
         *
         * 만약 중간에 같지 않은 문자가 존재한다면 answer에 No를 담고 break로 강제루프 종료를 시킴
         */
        int cards1Idx = 0;
        int cards2Idx = 0;

        for (int i = 0; i < goal.length; i++) {

            if (cards1Idx < cards1.length && goal[i].equals(cards1[cards1Idx])) {
                cards1Idx++;
                answer = "Yes";

            } else if (cards2Idx < cards2.length && goal[i].equals(cards2[cards2Idx])) {
                cards2Idx++;
                answer = "Yes";

            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}
