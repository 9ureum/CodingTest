class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries) {
            int tmp1 = arr[query[0]];
            int tmp2 = arr[query[1]];
            arr[query[0]] = tmp2;
            arr[query[1]] = tmp1;
        }
        return arr;
    }
}