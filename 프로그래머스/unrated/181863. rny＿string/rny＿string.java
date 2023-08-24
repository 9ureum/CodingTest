class Solution {
    public String solution(String rny_string) {
        String answer = rny_string;
        if(rny_string.contains("m")){
            answer = rny_string.replace("m","rn");
        }
        return answer;
    }
}