class Solution {
    //장군개미 : 5, 병정개미 : 3, 일개미 : 1
    public int solution(int hp) {
        int answer = 0;
        int janggun = 5;
        int byeongjung = 3;
        int gaemi = 1;
        
        answer = (hp / janggun) + (hp - (hp / janggun) * 5) / byeongjung 
            + (hp - (hp / janggun) * 5) - ((hp - (hp / janggun) * 5)/ byeongjung) * 3;
        
        return answer;
    }
}