class Solution {
    public int[] solution(int[] arr) {
        int leng = 0;
int index = 0;
        for (int num : arr){
            leng += num;
        }
        int[] answer = new int[leng];
        for (int num : arr){
            for(int i = 0; i < num; i++) {
answer[index++] = num;
}
        }
        
        return answer;
    }
}