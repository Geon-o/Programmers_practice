package com.example.programmers.LV1;

public class StringOfNumbersAndWords {
    public static void main(String[] args) {
        String s = "23four5six7";
        long start = System.currentTimeMillis();
        System.out.println(solution(s));
        long estimatedTime = System.currentTimeMillis() - start;

        System.out.println("걸린 시간 : " + estimatedTime/1000.0 + " milli seconds");
    }

    public static int solution(String s) {
        int answer = 0;
        String combination = "";
        String conversionCombination = "";

        for (int i = 0; i < s.length(); i++) {
            /**
             * if문으로 s.charAt했을 때 숫자나 나올경우 숫자만 따로 처리하는 로직
             * 숫자가 아니라면 switch-case 문으로 알맞게 매핑됐을 때 변환된 숫자값을 넣어주고
             * combination 변수를 초기화해줌
             */
            if (48 <= s.charAt(i) && s.charAt(i) <= 57){
                conversionCombination += s.charAt(i);
            } else {
                combination += s.charAt(i);

                switch (combination) {
                    case "zero" -> {
                        conversionCombination += "0";
                        combination = "";
                    }
                    case "one" -> {
                        conversionCombination += "1";
                        combination = "";
                    }
                    case "two" -> {
                        conversionCombination += "2";
                        combination = "";
                    }
                    case "three" -> {
                        conversionCombination += "3";
                        combination = "";
                    }
                    case "four" -> {
                        conversionCombination += "4";
                        combination = "";
                    }
                    case "five" -> {
                        conversionCombination += "5";
                        combination = "";
                    }
                    case "six" -> {
                        conversionCombination += "6";
                        combination = "";
                    }
                    case "seven" -> {
                        conversionCombination += "7";
                        combination = "";
                    }
                    case "eight" -> {
                        conversionCombination += "8";
                        combination = "";
                    }
                    case "nine" -> {
                        conversionCombination += "9";
                        combination = "";
                    }
                }
            }
        }
        answer = Integer.parseInt(conversionCombination);
        return answer;
    }
    /**
     * switch-case문으로 코드가 지저분에보이는데 앞으로
     * 변환 문제같은건 replace나 replaceAll메소드를 사용해야겠다고 생각됨
     */
}
