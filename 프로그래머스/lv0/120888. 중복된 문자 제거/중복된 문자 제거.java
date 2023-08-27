class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] mystr = my_string.split("");
        for (String str : mystr) {
            if (!answer.contains(str)) {
                answer += str;
            }
        }
        return answer;
    }
}