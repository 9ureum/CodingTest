import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] answer = a.split("");
        for(String str : answer) {
            System.out.println(str);
        }
    }
}