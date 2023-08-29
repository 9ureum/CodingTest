import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answers = new ArrayList<>();
        answers.add(-1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        for (int j = arr.length - 1; j > 0; j--) {
            if (arr[j] == 2) {
                end = j;
                break;
            }
        } 
        if(list.contains(2)) {
            answers.remove(0);
            for(int i = start; i <= end; i++) {
                answers.add(arr[i]);
            }
        }
        int[] answer = new int[answers.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answers.get(i);
        }
        return answer;
    }
}