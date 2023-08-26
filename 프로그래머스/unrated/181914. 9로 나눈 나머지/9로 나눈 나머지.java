class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] str = number.split("");
        for(String num : str) {
            sum += Integer.parseInt(num);
        }
        answer = sum % 9;
        return answer;
    }
}