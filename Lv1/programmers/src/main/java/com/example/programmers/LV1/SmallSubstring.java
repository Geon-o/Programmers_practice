package com.example.programmers.LV1;

public class SmallSubstring {
    public static void main(String[] args) {
        String t = "10203";
        String p  = "15";

        System.out.println(solution(t, p));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        int i = 0;

        /**
         * while문으로 루프를 돌려주고 tmp 변수에 t를 i부터 p의 길이 +i 만큼씩 잘라서
         * if 문으로 비교
         *
         * 값 비교를 위해 숫자로 변경(Integer로 변경하면 런타임 에러가 발생할 수 있음 Long타입으로 변경)
         * 변경 후 값 비교 -> answer 값을 증가 시킴 루프 안에 로직이 끝나면 i 값도 증가하면서 한칸씩 이동하게 함
         * 하지만 substring에서 자르려는 값보다 잘려질 값이 작으면 예외발생 try-catch문으로 예외처리해주고 catch 문에 break를 걸어 루프 중지
         *
         * */
        while (true){
            try {
                String tmp = t.substring(i, p.length() + i);

                if (Long.parseLong(tmp) <= Long.parseLong(p)){
                    answer++;
                }

                i++;

            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return answer;
    }
}
