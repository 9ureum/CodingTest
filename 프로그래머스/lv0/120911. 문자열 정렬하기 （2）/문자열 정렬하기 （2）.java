import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = my_string.toLowerCase();
        String[] tmp = s.split("");
        Arrays.sort(tmp);
        
        for (String str : tmp) {
            answer += str;
        }
        
        return answer;
    }
}