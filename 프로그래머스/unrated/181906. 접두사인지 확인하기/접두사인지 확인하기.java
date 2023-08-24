class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String bana = "";
        String[] str = my_string.split("");
        for (String s : str) {
            bana += s;
            if (is_prefix.equals(bana)){
                answer = 1;
            }
        }
        return answer;
    }
}