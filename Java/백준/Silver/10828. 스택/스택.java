

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = scanner.nextLine();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            if(strings[i].contains("push")){
                String[] str  = strings[i].split(" ");
                int num = Integer.parseInt(str[1]);
                stack.push(num);
            }else if(strings[i].equals("pop")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }else if(strings[i].equals("size")){
                System.out.println(stack.size());
            }else if(strings[i].equals("empty")){
                System.out.println(stack.isEmpty()?1:0);
            }else if(strings[i].equals("top")){
                System.out.println(stack.isEmpty()?-1:stack.peek());
            }
        }

    }


}
