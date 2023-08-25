import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        if (direction.equals("right")) {
            for(int i = 0; i < numbers.length - 1; i++) {
                list.add(numbers[i]);
            }
            list.add(0,numbers[numbers.length - 1]);
                
        } else {
            for(int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}