class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] morsealpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] letterstr = letter.split(" ");
        for(String str : letterstr) {
            for(int i = 0; i < morse.length; i++ ) {
                if (str.equals(morse[i])) {
                    answer += morsealpha[i];
                }
            }
        }
        return answer;
    }
}