import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] numarr = num.split("");
        for(String str : numarr) {
            answer += Integer.parseInt(str);
        }

        return answer;
    }
}