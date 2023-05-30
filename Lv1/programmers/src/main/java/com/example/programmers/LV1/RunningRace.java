package com.example.programmers.LV1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RunningRace {
    public static void main(String[] args) {

        String[] player = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solution(player, callings)));
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            /**
             * playerMap에 players에 담겨잇는 선수들의 이름을 인덱스 번호와 함께 넣는다
             * */
            playerMap.put(players[i], i);
        }

        for (String player : callings) {
            /**
             * 먼저 callings에 담긴 선수 이름으로 playerMap.get으로 키값으로 선수 인덱스 번호를 찾는다.
             * 찾은 인덱스 번호를 playerNum에 담는다.
             *
             * 앞에 있는 요소와 자리를 바꾸기 위해 앞에 있는 요소도 찾기 위해
             * 매개변수 players[playerNum - 1]로 현재 찾은 player의 인덱스의 앞 요소를 찾는다.
             * 해당 요소를 goAheadPlayer에 담는다.
             *
             * 이에 players[playerNum - 1](callings 에서 찾은 요소를 기존 배열에서 앞으로 이동하기 위해
             * 현재 요소의 인덱스 -1을 하여 앞에 배치)에 callings로 찾은 선수 이름을 넣는다.
             *
             * 앞으로 이동한 선수 위치에 이전에 앞에 위치해있던 선수를 이동한 선수 인덱스에 담아준다.
             *
             * playerMap에도 같이 갱신한다.
             * */
            int playerNum = playerMap.get(player);
            String goAheadPlayer = players[playerNum - 1];

            players[playerNum - 1] = player;
            players[playerNum] = goAheadPlayer;

            playerMap.put(player, playerNum - 1);
            playerMap.put(goAheadPlayer, playerNum);
        }

        return players;
    }
}
