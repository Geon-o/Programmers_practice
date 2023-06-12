package com.example.programmers.LV1;

import java.util.*;

public class NumberMate {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";

        System.out.println(solution2(X, Y));
    }

    public static String solution1(String X, String Y) {
        /**
         * 시간초과 코드
         */
        String answer = "";
        StringBuffer x = new StringBuffer(X);
        StringBuffer y = new StringBuffer(Y);
        StringBuilder tmp = new StringBuilder();
        List<Integer> totalList = new ArrayList<>();

        for (int i = 0; i < x.length();) {
            char xc = x.charAt(0);

            for (int j = 0; j < y.length(); j++) {
                char yc = y.charAt(j);

                if (xc == yc) {
                    switch (xc) {
                        case '0' -> totalList.add(0);
                        case '1' -> totalList.add(1);
                        case '2' -> totalList.add(2);
                        case '3' -> totalList.add(3);
                        case '4' -> totalList.add(4);
                        case '5' -> totalList.add(5);
                        case '6' -> totalList.add(6);
                        case '7' -> totalList.add(7);
                        case '8' -> totalList.add(8);
                        case '9' -> totalList.add(9);
                    }

                    y.deleteCharAt(j);
                    break;
                }
            }
            x.deleteCharAt(0);
        }

        /**
         * 내림차순으로 정렬하는게 시간이 오래걸리는것 같아 오름차순으로 정렬하고
         * for문을 돌려 뒤쪽부터 가져오도록 변경
         *
         * 이것 마저도 해결되지 않음음         */
//        Collections.sort(totalList, Collections.reverseOrder());
        Collections.sort(totalList);

        for (int i = totalList.size() - 1; i >= 0; i--) {
            tmp.append(totalList.get(i));
        }

        if (totalList.isEmpty()) {
            return "-1";
        }

        answer = tmp.charAt(0) == '0' ? "0" : tmp.toString();

        return answer;
    }

    public static String solution2(String X, String Y) {
        /**
         * 참고하여 변경한 코드
         */
        String answer = "";
        StringBuilder tmp = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for (String x : X.split("")) {
            arrX[Integer.parseInt(x)]++;
        }

        for (String y : Y.split("")) {
            arrY[Integer.parseInt(y)]++;
        }

        for (int i = 9; i >= 0; i--) {
            if (arrX[i] > 0 && arrY[i] > 0) {
                int min = Math.min(arrX[i], arrY[i]);

                for (int j = 0; j < min; j++) {
                    tmp.append(i);
                }
            }
        }

        if (tmp.length()>0){
            answer = tmp.charAt(0)=='0'? "0": tmp.toString();
        } else {
            answer = "-1";
        }

        return answer;
    }
}
