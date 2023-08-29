import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int x = 0; x < commands.length; x++) {
            int num1 = commands[x][0]; //2
            int num2 = commands[x][1]; //5
            int num3 = commands[x][2]; //3
            int idx = 0;
            int[] tmp = new int[num2-num1+1];
            for (int y = num1-1; y < num2; y++) {
                tmp[idx++] = array[y];
            }
            Arrays.sort(tmp);
            answer[index++] = tmp[num3-1];
        }
        return answer;
    }
}