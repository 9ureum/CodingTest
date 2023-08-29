import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> part = new HashMap<>();
        for (String str : participant) {
            part.put(str, part.getOrDefault(str,0) + 1);
        }
        for (String str : completion) {
            part.put(str, part.getOrDefault(str,0) - 1);
        }
        for (String str : part.keySet()) {
            if(part.get(str) == 1) {
                answer = str;

            }
        }
        
        return answer;
    }
}