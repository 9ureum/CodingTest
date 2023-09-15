class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int leng = arr.length;
        int cnt = 0;
        while (leng % 2 == 0) {
            leng = leng / 2;
        }
        if (leng == 1) {
                return arr;
        }
        int ans = 0;
        while (len > ans) {
           ans = (int)Math.pow(2, cnt++);
        }
        int[] answer = new int[ans];
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}