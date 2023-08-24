class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int tmp = 0;
        for (int num : numbers){
            tmp += num;
            if (tmp > n) {
                answer = tmp;
                break;
            }

}
        return answer;
    }
}