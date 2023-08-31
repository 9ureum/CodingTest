class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmp = my_string.replaceAll("[a-z,A-Z]"," ");
        String[] num = new String[tmp.length()];
        num = tmp.split(" ");
        for(String str : num) {
            if (str.equals("")) {
                continue;
            } else {
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}