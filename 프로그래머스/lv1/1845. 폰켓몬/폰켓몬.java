import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> ponketmon = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            ponketmon.add(nums[i]);
        }
        if (nums.length/2 < ponketmon.size()) {
            answer = nums.length/2;
        } else {
            answer = ponketmon.size();
        }
        return answer;
    }
}