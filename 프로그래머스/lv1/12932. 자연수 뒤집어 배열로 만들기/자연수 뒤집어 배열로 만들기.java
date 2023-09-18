class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int[] answer = new int[num.length()];
        int cnt = 0;
        for (int i = num.length(); i > 0; i--) {
            answer[cnt++] = Integer.parseInt(num.substring(i - 1, i));
        }
        return answer;
    }
}