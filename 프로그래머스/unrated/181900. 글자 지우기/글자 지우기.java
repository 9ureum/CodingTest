import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        List<String> list = new ArrayList<>();
        String[] strarr = my_string.split("");
        for (String str : strarr) {
            list.add(str);
        }
        for(int i = indices.length; i > 0; i--) {
            list.remove(indices[i-1]);
        }
        for(String str : list) {
            answer += str;
        }
        return answer;
    }
}