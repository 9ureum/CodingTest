import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        String[] str = my_string.split("");
        Arrays.sort(str);
        int[] answer = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }
        return answer;
    }
}