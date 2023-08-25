class Solution {
    public String solution(int age) {
        String answer = "";
        String tmp = Integer.toString(age);
        String[] str = tmp.split("");
        for (String str1 : str) {
            answer += (char)(Integer.parseInt(str1) + 97);
        }
        return answer;
    }
}