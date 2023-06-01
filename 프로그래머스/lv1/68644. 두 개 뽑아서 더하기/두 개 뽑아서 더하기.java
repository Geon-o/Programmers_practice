import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        Integer[] answer = {};
        int pickOneNum = 0;
        List<Integer> arrayAfterRemove = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            pickOneNum = numbers[i];

            for (int j = 0; j < numbers.length; j++) {
                arrayAfterRemove.add(numbers[j]);
            }

            arrayAfterRemove.remove(i);

            for (int j = 0; j < arrayAfterRemove.size(); j++) {
                set.add(pickOneNum + arrayAfterRemove.get(j));
            }
            arrayAfterRemove.clear();
        }

        answer = set.toArray(new Integer[0]);
        Arrays.sort(answer);

        return answer;
    }
}