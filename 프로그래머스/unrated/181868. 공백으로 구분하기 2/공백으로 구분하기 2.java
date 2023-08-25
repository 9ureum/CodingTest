class Solution {
    public String[] solution(String my_string) {
        String tmp = my_string.replaceAll("\\s+"," ");
        tmp = tmp.trim();
        String[] answer = tmp.split(" ");
        return answer;
    }
}