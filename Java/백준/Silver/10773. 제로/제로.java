

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                //System.out.println("pop = "+ stack.pop());
                stack.pop();
            }else {
                stack.push(n);
                //System.out.println("push = "+stack.peek());
            }
        }
        int sum = 0;
        while (!stack.isEmpty()){
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
