class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] alpha = my_string.toCharArray();
        for (char c : alpha) {
            if((int)c >= 65 && (int)c < 97) {
                answer += (char)((int)c + 32) + "";
            } else {
                answer += (char)((int)c - 32) + "";
            }
        }
        return answer;
    }
}