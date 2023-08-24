class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        for (int num : sides) {
            sum += num; 
            if (num > max) { 
                max = num;
            }
        }
        
        if (max < sum - max) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}