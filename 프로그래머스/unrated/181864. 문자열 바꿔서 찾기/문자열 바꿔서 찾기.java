class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        str = myString.replace("A","C");
        str = str.replace("B","A");
        str = str.replace("C","B");
        if(str.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}