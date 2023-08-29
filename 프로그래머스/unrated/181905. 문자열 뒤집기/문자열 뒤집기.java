class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String tmp1 = my_string.substring(0,s);
        String tmp2 = my_string.substring(e+1,my_string.length());
        String tmp3 = "";
        
        for (int i = e; i >= s; i--) {
            tmp3 += my_string.substring(i,i+1);
        }
        answer = tmp1 + tmp3 + tmp2;
        return answer;
    }
}