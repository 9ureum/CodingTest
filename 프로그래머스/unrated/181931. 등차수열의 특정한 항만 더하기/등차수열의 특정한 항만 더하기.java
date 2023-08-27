class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int index = 0;
        int[] num = new int[included.length];
        for (int i = a; i <= a + (included.length - 1) * d; i = i + d) {
            num[index++] = i;
        }
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += num[i];
            }
        }

        return answer;
    }
}