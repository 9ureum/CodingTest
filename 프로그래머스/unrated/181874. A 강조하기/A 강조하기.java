class Solution {
    public String solution(String myString) {
        
        String tmp = "";
        tmp = myString.replaceAll("[a,A]","-");
        tmp = tmp.toLowerCase();
        tmp = tmp.replace("-","A");
        return tmp;
    }
}