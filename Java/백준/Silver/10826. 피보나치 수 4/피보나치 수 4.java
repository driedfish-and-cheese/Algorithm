

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0){
            System.out.println(0);
            return;
        }else if(n==1){
            System.out.println(1);
            return;
        }
        BigInteger[] arr = new BigInteger[n + 1];
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-2].add(arr[i-1]);
        }
        System.out.println(arr[n]);
    }
}
