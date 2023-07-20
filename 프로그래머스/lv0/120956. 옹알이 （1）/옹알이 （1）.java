import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++){
            for (int j = 0; j < str.length; j++){
                if (babbling[i].contains(str[j])){
                    babbling[i] = babbling[i].replace(str[j]," ");
                }
            }
            babbling[i] = babbling[i].trim();
            if (babbling[i].length() == 0){
                answer += 1;
            }
        }
        return answer;
    }
}