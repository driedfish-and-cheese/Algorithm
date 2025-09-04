import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int get = nums.length/2;
        nums = Arrays.stream(nums).distinct().toArray();
        if(get< nums.length){
            answer = get;
        }else answer = nums.length;
        return answer;
    }
}