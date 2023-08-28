import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> ponketmon = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            ponketmon.put(nums[i],nums[i]);
        }
        if (nums.length/2 < ponketmon.size()) {
            answer = nums.length/2;
        } else {
            answer = ponketmon.size();
        }
        return answer;
    }
}