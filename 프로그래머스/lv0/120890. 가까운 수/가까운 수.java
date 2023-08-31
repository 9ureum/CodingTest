class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int leng = 0;
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            leng = Math.abs(num - n);
            if (min > leng) {
                min = leng;
                answer = num;
            } else if (min == leng){
                answer = Math.min(answer,num);
            } else {
                continue;
            }
            
        }
        return answer;
    }
}