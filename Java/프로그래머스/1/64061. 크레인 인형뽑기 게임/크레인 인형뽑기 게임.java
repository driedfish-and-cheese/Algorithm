import java.util.Stack;


public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        for (int move : moves) {
            int column = move -1;
            for (int i = 0; i < board.length; i++) {
                if(board[i][column]==0){
                    continue;
                }else{
                    if(!basket.isEmpty()&&basket.peek().equals(board[i][column])){
                        //basket.pop();
                        basket.pop();
                        answer +=2;

                    }
                    else{
                        basket.push(board[i][column]);
                    }
                    board[i][column] = 0;

                    break;
                }

            }
        }
        return answer;
    }
}
