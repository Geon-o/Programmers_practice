package com.example.programmers;

public class CalculateScarceAmountOfMoney {

    public static void main(String[] args) {
        int price = 3;
        long money = 30;
        int count = 4;

        System.out.println(solution(price, money, count));

    }

    public static long solution(int price, long money, int count) {
        long answer = -1;

        long totalMoney = 0;

        for (int i = 0; i <= count; i++) {
            totalMoney += i * price;
        }

        if (totalMoney > money) {
            answer = totalMoney - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
