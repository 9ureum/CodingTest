class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean tmp1 = true;
        boolean tmp2 = true;
        if (x1 == true || x2 == true) {
            tmp1 = true;
        } else {
            tmp1 = false;
        }
        if (x3 == true || x4 == true) {
            tmp2 = true;
        } else {
            tmp2 = false;
        }
        if (tmp1 == false || tmp2 == false) {
            answer = false;
        } else {
            answer = true;
        }
        return answer;
    }
}