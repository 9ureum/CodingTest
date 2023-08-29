import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] bef = before.toCharArray();
        char[] aft = after.toCharArray();
        Arrays.sort(bef);
        Arrays.sort(aft);
        
        String befo = new String(bef);
        String afte = new String(aft);
        
        if (befo.equals(afte)) {
            answer = 1;
        }
        
        return answer;
    }
}