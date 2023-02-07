package com.example.programmers.LV1;

public class HarshadNumber {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int num = x;
        int sum = 0;

        while(num >= 1){
            sum += num % 10;
            num /= 10;
        }
        if(x % sum ==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}
