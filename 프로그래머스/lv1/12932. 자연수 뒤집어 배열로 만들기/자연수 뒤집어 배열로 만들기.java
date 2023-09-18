import java.util.*;

class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        StringBuilder sb = new StringBuilder(num);
        sb = sb.reverse();
        String[] splnum = sb.toString().split("");
        int[] answer =  new int[splnum.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Integer.parseInt(splnum[i]);
        }
        return answer;
    }
}