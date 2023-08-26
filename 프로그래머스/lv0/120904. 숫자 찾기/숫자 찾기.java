class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] strnum = Integer.toString(num).split("");
        for (int i = 0; i < strnum.length; i++){
            if (Integer.parseInt(strnum[i]) == k) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}