class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while((6 * answer) % n != 0){
            if((6 * answer) % n == 0){
              break;
            } else {
               answer++;
            }
        }
        return answer;
    }
}