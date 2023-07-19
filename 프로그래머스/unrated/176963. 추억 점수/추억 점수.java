import java.util.*;

class Solution {
    public ArrayList<Integer> solution(String[] name, int[] yearning, String[][] photo) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length ; j++) {
                
                for (int k = 0; k < name.length; k++) {
                    int sum = 0;
                    if (photo[i][j].equals(name[k])) {
                        sum += yearning[k]; 
                    } 
                    answer.add(sum);
                }
            }
        }
        return answer;
    }
}