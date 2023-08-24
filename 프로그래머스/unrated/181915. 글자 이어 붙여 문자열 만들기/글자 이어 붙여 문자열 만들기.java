import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] str = my_string.split("");
        for (int num : index_list) {
            answer += str[num];
        }
        return answer;
    }
}