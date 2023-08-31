class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int num = i; num <= j; num++) {
            for(int n = 0; n < Integer.toString(num).length(); n++) {
                String tmp = Integer.toString(num).charAt(n)+"";
                if(tmp.equals(Integer.toString(k))){
                    answer++;
                }
            }
        }
        return answer;
    }
}