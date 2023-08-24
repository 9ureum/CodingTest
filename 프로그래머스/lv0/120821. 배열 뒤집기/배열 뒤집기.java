class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int k = num_list.length - 1;
        for (int i = 0; i < num_list.length; i++) {
            answer[k--] = num_list[i];
        }
        return answer;
    }
}