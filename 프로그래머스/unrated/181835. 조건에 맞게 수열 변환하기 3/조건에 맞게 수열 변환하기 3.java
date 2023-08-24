class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int num = 0;
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[num++] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[num++] = arr[i] * k;
            }
        }
        return answer;
    }
}