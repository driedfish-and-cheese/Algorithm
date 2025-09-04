

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String K = br.readLine();
        String[] arr = K.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        boolean[] prime = new boolean[m + 1];
        for (int i = 2; i <= m; i++) {
            prime[i] = true;
        }
        for (int i = 2; i*i <= m; i++) {
            if(prime[i]){
                for (int j = i*i; j <= m; j+= i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = n; i <= m; i++) {
            if(prime[i]){
                System.out.println(i);
            }
        }
    }
}
