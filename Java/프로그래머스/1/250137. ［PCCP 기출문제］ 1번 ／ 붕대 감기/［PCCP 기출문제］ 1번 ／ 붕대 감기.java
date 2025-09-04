

public class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int last = attacks[attacks.length-1][0];
        int recent_health = health;
        int count = 0;
        int attack_time = 0;
        for (int i = 0; i <= last; i++) {
            count ++;
            if(attack_time < attacks.length && i == attacks[attack_time][0]){
                recent_health -= attacks[attack_time][1];
                if(recent_health<=0){
                    return -1;
                }
                attack_time++;
                count = 0;
            }else{
                if(count >=1){
                    recent_health += bandage[1];
                }
                if(count/bandage[0]!=0 && count % bandage[0] == 0){
                    recent_health += bandage[2];
                    count = 0;
                }
                if (health < recent_health) {
                    recent_health = health;
                }
            }
        }
        return recent_health;
    }
}
