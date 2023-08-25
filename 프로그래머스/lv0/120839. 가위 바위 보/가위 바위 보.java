class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] str = rsp.split("");
        for (String tt : str) {
            if (tt.equals("2")){
                answer += "0";
            } else if (tt.equals("0")){
                answer += "5";
            } else {
                answer += "2";
            }
        }
        return answer;
    }
}