import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String[] tmparr = myStr.split("[a,b,c]+");
        for(String t : tmparr) {
            if (!t.equals("")) {
                list.add(t);
            }
        }
        if (list.size() == 0) {
            list.add("EMPTY");
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}