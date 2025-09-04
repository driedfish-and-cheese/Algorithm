

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int n = board.length;
        int[] dhArray = {0,1,-1,0};
        int[] dwArray = {1,0,0,-1};
        List<Integer> dw = Arrays.stream(dwArray).boxed().collect(Collectors.toList());
        List<Integer> dh = Arrays.stream(dhArray).boxed().collect(Collectors.toList());
        for (int i = 0; i < dhArray.length; i++) {
            int h_check=0,w_check=0;
            h_check = h + dh.get(i);
            w_check = w + dw.get(i);
            if(0<=h_check && h_check<n && 0<=w_check && w_check<n){
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        return count;
    }
}
