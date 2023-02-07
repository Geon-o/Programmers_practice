package com.example.programmers.LV1;

public class AddMissingNumber {

    public static int solution(int[] numbers) {
        int answer = 0;
        int currentAddNum = 0;
        int addOneToNine = addNumToNum();

        for (int i = 0; i < numbers.length; i++) {
            currentAddNum += numbers[i];
        }
        answer = addOneToNine - currentAddNum;

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};

        System.out.println(solution(numbers));
    }

    public static int addNumToNum() {
        int addNum = 0;
        int startNum = 1;
        int endNum = 9;

        for (int i = 0; i < endNum; i++) {
            addNum += startNum;
            startNum++;
        }
        return addNum;
    }
}
