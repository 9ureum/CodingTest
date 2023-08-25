class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num1 = 0;
        String tmp = "";
        tmp = Integer.toString(a) + Integer.toString(b);
        num1 = Integer.parseInt(tmp);
        answer = 2 * a * b;
        if (num1 >= answer) {
            answer = num1;
        }
        return answer;
    }
}