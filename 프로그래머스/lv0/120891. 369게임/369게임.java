class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] str = Integer.toString(order).split("");
        for (String st : str) {
            if (st.equals("3")||st.equals("6")||st.equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}