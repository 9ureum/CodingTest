import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        String tmp = "";
        tmp = myStr.replaceAll("[a,b,c]"," ");
        String[] tmparr = tmp.split(" ");
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