package com.example.programmers.LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1, 7, 3}};

        System.out.println(solution(array, commands));
    }

    public static List<Integer> solution(int[] array, int[][] commands){
        List<Integer> answer = new ArrayList<>();
        List<Integer> selectRangeNum = new ArrayList<>();
        int firstPoint = 0;
        int endPoint = 0;
        int chooseNum = 0;

        /**
         * fisrtPoing, endPoint, chooseNum 변수를 만들어 commands 배열안에 있는 배열 값들을
         * 꺼내서 넣어준다.
         */
        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < commands[i].length; j++) {

                /**
                 * j값을 기준으로 알맞게 각 변수에 해당하는 값을 넣어준다.
                 */
                if (j == 0) {
                    firstPoint = commands[i][j];
                } else if(j == 1) {
                    endPoint = commands[i][j];
                } else {
                    chooseNum = commands[i][j];
                }
            }

            /**
             * 한번 루프가 끝나면 새로운 배열을 만들어 Arrays.copyOfRange를 사용하여
             * array를 원하는 길이만큼 잘라서 해당 배열에 넣어준다.
             *
             * 배열에 넣은 후 sort를 통해 정렬을 해준다.
             */
            int[] tmp = Arrays.copyOfRange(array, firstPoint - 1, endPoint);
            Arrays.sort(tmp);

            /**
             * 정렬된 숫자를 List 타입의 selectRangeNum 변수에 하나씩 넣어준다.
             */
            for (int j = 0; j < tmp.length; j++) {
                selectRangeNum.add(tmp[j]);
            }

            /**
             * selectRangeNum 변수에 담긴 숫자들 중 chooseNum 변수에 담긴 값의
             * 위치한 값을 꺼내어 asnwer 변수에 넣어준다.
             *
             * 여기까지가 1번의 루프과정이다.
             */
            answer.add(selectRangeNum.get(chooseNum - 1));
            selectRangeNum.clear();
        }

        return answer;
    }

    /**
     * 사실 코드를 다시 보았을때 뭔가 지저분한 느낌이 든다.
     * 다른 코드를 참고해보았을 때
     * int[] answer = new int[commands.length];
     *
     *         for(int i=0; i<commands.length; i++){
     *             int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
     *             Arrays.sort(temp);
     *             answer[i] = temp[commands[i][2]-1];
     *         }
     *
     *         return answer;
     *
     * 깔끔하긴하다. 변수를 지정하지 않고 그냥 commands에서 필요한 숫자만 꺼내와서 처리하면 되니깐
     *
     * 개인적인 생각으로 변수를 지정해주면 보기 편할것 같다는 생각이다.
     * 본인 코드에서 List객체를 두번이나 생성했기 떄문에 메모리도 위에 코드보다 더 많이 차지했을 것 같다.
     */
}
