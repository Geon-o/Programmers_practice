package com.example.programmers.LV1;

import java.util.*;

public class NotFinishPlayer {
    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution1(participant, completion));
    }

    /**
     * 테스트케이스는 모두 통과하나 효율성에서 통과하지 못한 코드
     * ArrayList가 문제일 수도 있다는 의심
     */
    public static String solution1(String[] participant, String[] completion) {
        String answer = "";
        List<String> list1 = new ArrayList<>(List.of(participant));
        List<String> list2 = new ArrayList<>(List.of(completion));

        Collections.sort(list1);
        Collections.sort(list2);

        boolean bool = true;

        for (int i = 0; bool;) {
            for (int j = 0; bool;) {
                if (list2.isEmpty()) {
                    bool = false;
                }else if (list1.get(i).equals(list2.get(j))) {
                    list1.remove(i);
                    list2.remove(j);
                } else if (!(list1.get(i).equals(list2.get(j)))){
                    i++;
                }
            }
        }

        answer = list1.get(0);

        return answer;
    }

    /**
     * ArrayList는 remove시 각 요소들을 재배치하여 추가 공간이나 빈공간을 채워야하기 떄문에 처리 속도가 늦는 반면
     * LinkedList는 각 노드간 연결만 변경해주면 되기 때문에 처리속도가 빠름
     *
     * ArrayList를 LinedList로 변경 후 테스트케이스 및 효율성 모두 통과
     */
    public static String solution2(String[] participant, String[] completion) {
        String answer = "";
        List<String> list1 = new LinkedList<>(List.of(participant));
        List<String> list2 = new LinkedList<>(List.of(completion));

        Collections.sort(list1);
        Collections.sort(list2);

        boolean bool = true;

        for (int i = 0; bool;) {
            for (int j = 0; bool;) {
                if (list2.isEmpty()) {
                    bool = false;
                }else if (list1.get(i).equals(list2.get(j))) {
                    list1.remove(i);
                    list2.remove(j);
                } else if (!(list1.get(i).equals(list2.get(j)))){
                    i++;
                }
            }
        }

        answer = list1.get(0);

        return answer;
    }

    /**
     * 다른 사람코드
     * HashMap을 통해 처음 participant를 넣어줄때 각 value로 1을 넣어줬고
     * 두번째 completion을 넣을때 이미 있는 key라면 해당 key의 value 값을 -1 해줘 0으로 만든 후
     * if 문을 통해 해당 key의 value 값이 0이 아닌 key만 찾아 처리
     *
     * 깔끔하고 효율적인 코드라고 봄
     * 정렬할 필요도 없고 형변환 할 필요도 없으므로 좋은 코드라고 생각함
     */
    public static String solution3(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
