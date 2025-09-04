

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while(queue.size() != 1){
            queue.removeFirst();
            int num =queue.removeFirst();
            queue.offerLast(num);

        }
        System.out.println(queue.peekFirst());
    }
}
