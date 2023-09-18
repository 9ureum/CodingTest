class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int tmp = 0;
        for (int num : arr) {
            tmp += num;
        }
        answer = tmp / (double) arr.length; 
        return answer;
    }
}