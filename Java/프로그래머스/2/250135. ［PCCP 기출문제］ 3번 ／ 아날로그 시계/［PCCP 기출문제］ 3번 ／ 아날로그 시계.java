

public class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = -1;
        double hourMeet = 43200.0/719;
        double minuteMeet = 3600.0/59;


        double sumTime1 = h1*3600 + m1*60 + s1;
        double sumTime2 = h2*3600 + m2*60 + s2;

        int hour = (int)(Math.floor(sumTime2/hourMeet))-(int)(Math.ceil(sumTime1/hourMeet))+1;
        int minute = (int)(Math.floor(sumTime2/minuteMeet))-(int)(Math.ceil(sumTime1/minuteMeet))+1;
        int tripleMeet = (int)(Math.floor(sumTime2 / 43200)) - (int)(Math.ceil(sumTime1 / 43200))+1;
        answer = hour + minute - tripleMeet;
        return answer;
    }
}
