import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {     
            int cnt = 0;
            for (int num : delete_list) {
                if (arr[i] == num) {
                    cnt++;
                }
            }
            if (cnt == 0) {
                list.add(arr[i]);
            }
            
        }
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] =  list.get(j);
        }
        return answer;
    }
}