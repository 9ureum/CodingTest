class Solution {
    public int solution(int n, String control) {

        String[] ctrl = control.split("");
        for (String str : ctrl) {
            
            if (str.equals("w")) {
                n += 1;
                continue;
            } else if (str.equals("s")) {
                n -= 1;
                 continue;
            } else if (str.equals("d")) {
                n += 10;
                 continue;
            } else {
                n -= 10;
                 continue;
            }
            
        }
        return n;
    }
}