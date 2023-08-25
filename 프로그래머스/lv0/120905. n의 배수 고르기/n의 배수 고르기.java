import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        
        for (int num : numlist) {
            list.add(num);
        }
        for (int number : numlist) {
            if (number % n != 0) {
                list.remove((Integer)number);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}