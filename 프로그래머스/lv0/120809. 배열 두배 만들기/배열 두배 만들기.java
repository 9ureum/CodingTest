class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int k = 0;
        for (int num : numbers) {
            answer[k++] = num * 2;
        }
        return answer;
    }
}