import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<String, Integer> m = new HashMap<>();
        String[] strarr = s.split("");
        Arrays.sort(strarr);
        for (String str : strarr) {
            m.put(str, m.getOrDefault(str,0) + 1);
        }
        for (String ss : m.keySet()) {
            if (m.get(ss) == 1) {
                answer += ss;
            } else {
                continue;
            }
        }
        return answer;
    }
}