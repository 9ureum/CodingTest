class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp = 1;
        for (int i = 1; i <= 10; i++) {
            tmp *= i;
            if (tmp > n) {
                answer = i - 1;
                break;
            } else {
                answer = i;
            }
        }
        return answer;
    }
}