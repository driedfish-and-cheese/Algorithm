
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sc = new int[2];
        for (int i = 0; i < 2; i++) {
            sc[i] = scanner.nextInt();
        }
        int N = sc[0];
        int K = sc[1];
        LinkedList<Integer> jose = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            jose.add(i);
        }
        int[] answer = new int[sc[0]];
        int count = 0;
        int idx =0;
        while(!jose.isEmpty()){
            int current  = jose.removeFirst();
            idx++;
            if(idx==K){
                answer[count++] = current;
                idx=0;
            }else{
                jose.add(current);
            }
        }
        System.out.print("<");
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
            if(i !=answer.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(">");
    }
}
