

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = bufferedReader.readLine();
        }
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            if(strings[i].contains("push")){
                String[] str  = strings[i].split(" ");
                int num = Integer.parseInt(str[1]);
                queue.offerLast(num);
            }else if(strings[i].equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(queue.removeFirst());
                }
            }else if(strings[i].equals("size")){
                System.out.println(queue.size());
            }else if(strings[i].equals("empty")){
                System.out.println(queue.isEmpty()?1:0);
            }else if(strings[i].equals("front")){
                System.out.println(queue.isEmpty()?-1:queue.peekFirst());
            }else if(strings[i].equals("back")){
                System.out.println(queue.isEmpty()?-1:queue.peekLast());
            }
        }

    }


}

