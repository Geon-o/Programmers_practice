package com.example.programmers.Lv0;

import java.util.*;

public class Mode {

    public static void main(String[] args) {
        int[] array = {0,0,0,1};

        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        if (array.length == 1) {
            answer = array[0];

        } else {
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }

            for (int i = 0; i < array.length; i++) {
                list.add(array[i]);
            }

            for (int num : set) {
                map.put(num, Collections.frequency(list, num));
            }


            int max = -1;
            int index = -1;

            for (int key : map.keySet()) {
                if (max < map.get(key)) {
                    max = map.get(key);
                    answer = key;
                } else if (max == map.get(key)) {
                    index = key;
                }
            }

            if (map.get(index) == map.get(answer)) {
                return -1;
            }
        }

        return answer;
    }
}
